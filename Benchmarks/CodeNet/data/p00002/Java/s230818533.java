import java.io.*;
import java.util.*;
public class Main{
 public static void main(String args[])throws IOException{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String str=br.readLine();
  while(str!=null){
   StringTokenizer st=new StringTokenizer(str);
   int i=Integer.parseInt(st.nextToken());
   int j=Integer.parseInt(st.nextToken());
   System.out.println(String.valueOf(i*j).length());
   str=br.readLine();
  }
 }
}