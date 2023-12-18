import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s;
       int count=0;
       int sum=0;
       while((s=br.readLine())!=null){
           String[] str = s.split(" ");
           int n = Integer.parseInt(str[0]);
           int x = Integer.parseInt(str[1]);
           if((n!=0 && x!=0) && (n>=3 && n<100)){
               for(int i=1; i<n; i++){
                   for(int j=1; j<n; j++){
                       if(!(i==j || i==n || j==n)){
                        sum = i + j + n;
                        //System.out.println(sum+"="+i+" "+j+" "+n);
                        if(sum==x){
                            count++;
                            //System.out.println(count);
                        }
                       }
                   }
               }
           }else{
               break;
           }
       }
       System.out.println(count);
    }
}