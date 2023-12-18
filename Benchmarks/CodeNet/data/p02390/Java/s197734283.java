import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String str = br.readLine();
  String[] strAry = str.split(" ");
  int S = Integer.parseInt(strAry[0]);
  int h,m,s;  
  h=S/3600;
  m=(S%3600)/60;  
  s=(S%3600)%60;

  System.out.println(h +":"+ m +":"+ s);
 }
}