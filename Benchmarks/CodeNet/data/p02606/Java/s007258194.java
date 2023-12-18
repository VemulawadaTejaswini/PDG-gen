import java.io.*;
 
public class Main{
  public static void main(String[] args){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int l,r,d;
        int count=0;
        
        String str1=br.readLine();
        l=Integer.parseInt(str1);
        String str2=br.readLine();
        r=Integer.parseInt(str2);
        String str3=br.readLine();
        d=Integer.parseInt(str3);
       
    
      for(int i=l;i<r;i++){
        if(i%d==0)System.out.println(count);
         count++;
        
          }
  
  }
}