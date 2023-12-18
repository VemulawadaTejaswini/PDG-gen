import java.io.*;
 
public class Main{
  public static void main(String[] args)throws IOException{
     
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
 
    String[] strAry = str.split(" ");
     
    int x = Integer.parseInt(strAry[0]);
    int y = Integer.parseInt(strAry[1]);
    int z = Integer.parseInt(strAry[2]);
 
    if(x < y && y < z && x < z){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}