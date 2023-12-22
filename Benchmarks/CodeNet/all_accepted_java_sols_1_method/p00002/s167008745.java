import java.io.*;
import java.util.*;
public class Main{
 public static void main(String args[]){
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  try{
   String str=null;
   while((str=br.readLine())!=null){
    StringTokenizer st=new StringTokenizer(str);
    int i=Integer.parseInt(st.nextToken());
    int j=Integer.parseInt(st.nextToken());
    System.out.println(String.valueOf(i+j).length());
   }
   br.close();
  }catch(Exception ex){
  System.exit(0);
  }
 }
}