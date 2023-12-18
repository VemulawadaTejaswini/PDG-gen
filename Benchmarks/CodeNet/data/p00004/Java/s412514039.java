import java.io.*;
import java.util.*;
public class Main{
 public static void main(String args[]){
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  try{
   String str=br.readLine();
   StringTokenizer st=new StringTokenizer(str);
   Double a=Double.parseDouble(st.nextToken());
   Double b=Double.parseDouble(st.nextToken());
   Double c=Double.parseDouble(st.nextToken());
   Double d=Double.parseDouble(st.nextToken());
   Double e=Double.parseDouble(st.nextToken());
   Double f=Double.parseDouble(st.nextToken());
   Double x;
   Double y;
   if(b!=0){
    x=(f-(e*c/b))/(d-(e*a/b));
    y=(c-(a*x))/b;
   }else{
    x=c/a;
    y=(f-(c*d/a))/e;
   }
   if(x==-0.0){
    x=Math.abs(x);
   }
   if(y==-0.0){
    y=Math.abs(y);
   }
   System.out.printf("%.3f %.3f",x,y);
  }catch(Exception e){
  }
 }
}