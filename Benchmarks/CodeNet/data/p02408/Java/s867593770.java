import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int num,i,j;
  num = Integer.parseInt(br.readLine());
  int[][] cards = new int[4][13]; 
  
   for(i=0;i<4;i++){
    for(j=0;j<13;j++){
     cards[i][j]=0;
    }
   }
  
   for(i=0;i<num;i++){ 
    String str = br.readLine(); 
    String[] strAry = br.readLine().split(" ");
    
    
   }


  
 }
}