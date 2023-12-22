import java.io.*;
 
public class Main {
 public static void main(String args[]) throws IOException {
  BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
  String bs=b.readLine();
  try{
   int bi=Integer.parseInt(bs);
   int x=bi;
   for(int i=0;i<2;i++){
    x=x*bi;
   }
   System.out.println(x);
  }catch(NumberFormatException e){
      e.printStackTrace();
  }
 }
}