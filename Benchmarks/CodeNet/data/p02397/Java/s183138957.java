import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
  int x,y;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String str = br.readLine();
  
  
  while(true){
     String[] strAry = str.split(" ");
    x = Integer.parseInt(strAry[0]);  
    y = Integer.parseInt(strAry[1]);   
    if(x==0&&y==0) break;   
    if(x<y){
      System.out.println(x + " "+ y\n);
    }else{    
      System.out.println(y + " "+ x\n);
    }
  }
 }
}