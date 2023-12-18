import java.io.*;
import java.util.*;
public class Main{
 public static void main(String args[]){
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  try{
   String str=br.readLine();
   int n[]=new int[3];
   while((str=br.readLine())!=null){
    StringTokenizer st=new StringTokenizer(str);
    for(int i=0;i<=2;i++){
     n[i]=Integer.parseInt(st.nextToken());
    }
    Arrays.sort(n);
    int a=(int)Math.pow(n[0],2);
    int b=(int)Math.pow(n[1],2);
    int c=(int)Math.pow(n[2],2);
    if(a+b==c){
     System.out.println("YES");
    }else{
     System.out.println("NO");
    }
   }
  }catch(Exception ex){
  }
 }
}