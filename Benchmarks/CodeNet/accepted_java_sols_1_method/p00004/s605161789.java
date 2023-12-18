import java.io.*;
import java.util.*;
public class Main{
 public static void main(String args[]){
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String str;
  try{
   while((str=br.readLine())!=null){;
    StringTokenizer st=new StringTokenizer(str);
    Double a=Double.parseDouble(st.nextToken());
    Double b=Double.parseDouble(st.nextToken());
    Double c=Double.parseDouble(st.nextToken());
    Double d=Double.parseDouble(st.nextToken());
    Double e=Double.parseDouble(st.nextToken());
    Double f=Double.parseDouble(st.nextToken());
    Double x;
    Double y;
    x=((c*e)-(b*f))/((a*e)-(b*d));
    y=((c*d)-(a*f))/((b*d)-(a*e));
    if(x==0){
     x=Math.abs(x);
    }
    if(y==0){
     y=Math.abs(y);
    }
    System.out.printf("%4.3f %4.3f\n",x,y);
   }
  }catch(Exception e){
  }
 }
}