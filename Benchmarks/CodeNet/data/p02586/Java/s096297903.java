import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
       	final int R = sc.nextInt();
        final int C = sc.nextInt();
        final int K = sc.nextInt();
        
        final int[][] Val = new int[R][C];
        for (int k = 0; k < K; k++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;
            int v = sc.nextInt();
            Val[r][c] = v;
        }
  	long[][][] data = new long[R][C][4];
  	//00
      {
  int v = Val[0][0];
  if(v>0)
    data[0][0][1]=v;
      }
  
  //left
  for(int i=1;i<R;i++){
  	data[i][0][0]=Long.max(data[i-1][0][0],data[i-1][0][1]);
    int v = Val[i][0];
    if(v>0){
   	data[i][0][1]=data[i][0][0]+v;
    }
    }
    
    //up
    for(int j=1;j<C;j++){
    	int v = Val[0][j];
      	if(0<v){
        data[0][j][0]=data[0][j-1][0];
          for(int p=1;p<4;p++){
          data[0][j][p]=Long.max(data[0][j-1][p],data[0][j-1][p-1]+v);
          }
          
        }else{
        data[0][j]=data[0][j-1];
        }
    
    }
    
    //DP
    
    for(int i=1;i<R;i++){
    	for(int j=1;j<C;j++){
        	int v = Val[i][j];
          	long maxUp = maxFrom4(data[i-1][j]);
          	if(0<v){
            	data[i][j][0]=Long.max(data[i][j-1][0],maxUp);
              	data[i][j][1]=maxFrom3(data[i][j-1][1],data[i][j-1][0]+v,maxUp);
              	data[i][j][2]=Long.max(data[i][j-1][2],data[i][j-1][1]+v);
              	data[i][j][3]=Long.max(data[i][j-1][3],data[i][j-1][2]+v);
            } else if (data[i][j - 1][0] < maxUp) {
                    data[i][j][0] = maxUp;
                    data[i][j][1] = data[i][j - 1][1];
                    data[i][j][2] = data[i][j - 1][2];
                    data[i][j][3] = data[i][j - 1][3];
                } else {
                    data[i][j] = data[i][j - 1];
                }
          	
        }
    }
      System.out.println(maxFrom4(data[R - 1][C - 1]));
  
  }
		static long maxFrom3(long val1, long val2, long val3) {
        return Long.max(Long.max(val1, val2), val3);
    }
    
    	static long maxFrom4(long[] vals) {
        return Long.max(Long.max(vals[0], vals[1]), Long.max(vals[2], vals[3]));
    }
}
