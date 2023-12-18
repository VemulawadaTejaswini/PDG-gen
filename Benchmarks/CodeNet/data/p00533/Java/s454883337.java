import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		int h = sc.nextInt(),w = sc.nextInt();
		int cnt=0,ccnt=0;
		String data[][] = new String[h][w];
		int ndata[][] = new int[h][w];
		/*for(int i = 0;i < h;i++){
			for(int j = 0;j < w;j++){
	    		data[i][j] = sc.next();
			}
		}*/
		for(int i = 0;i < h;i++){
			for(int j = 0;j < w;j++){
				data[i][j] = sc.next();
				if(data[i][j].equals(".")){
					if(ccnt != 1){
						ndata[i][j] = -1;
					}else{
						cnt++;
						ndata[i][j] = cnt;
					}
				}
				else if(data[i][j].equals("c")){
					 cnt = 0;
	    			 ccnt = 1;
	    			 ndata[i][j] = 0;
				}
				if((j+1) == w) ccnt = 0;
			}
		}
		for(int i = 0;i < h;i++){
			for(int j = 0;j < w;j++){
				if((j+1)==w){
					System.out.println(ndata[i][j]);
				}else{
					System.out.print(ndata[i][j]+" ");
				}
			}
		}
			
	}
}