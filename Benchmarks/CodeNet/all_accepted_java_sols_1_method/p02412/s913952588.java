import java.util.*;
import java.io.*;
 
class Main{
    public static void main(String args[])throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s;
       while((s=br.readLine())!=null){
           String[] str = s.split(" ");
           int n = Integer.parseInt(str[0]);
           int x = Integer.parseInt(str[1]);
           if(n==0 && x==0) break;
           int count=0;
           for(int i=1; i<n; ++i){
               for(int j=i; j<n; ++j){
                   if(i==j) continue;
                   int num = x - (i+j);
                   if(num<1) break;
                   if(num<j) break;
                   if(i != num && j != num && num <= n) count++;
                   num = 0;
               }
           }     
       System.out.println(count);
       }
    }
}