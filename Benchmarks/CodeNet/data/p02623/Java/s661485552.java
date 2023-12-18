//I AM THE CREED
/* //I AM THE CREED
/* package codechef; // don't place package name! */
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
import java.util.*;
import java.awt.Point;
public class Main{
    public static void main(String[] args) throws IOException 
    { 
  
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int m=input.nextInt();
            long tot=input.nextLong();
            Long[] l=new Long[n];
            Long[] l1=new Long[m];
            for(int i=0;i<n;i++){
                if(i==0){
                    l[i]=input.nextLong();
                    continue;
                }
                l[i]=input.nextLong()+l[i-1];
            }
            for(int i=0;i<m;i++){
                if(i==0){
                    l1[i]=input.nextLong();
                    continue;
                }
                l1[i]=input.nextLong()+l1[i-1];
            }
            int max=0;
            for(int i=0;i<n;i++){
                long rem=tot-l[i];
                if(rem<0){
                    break;
                }
                int lower=0;
                int upper=m-1;
                while(upper>lower){
                    if(upper==lower+1){
                        if(l1[upper]<=rem){
                            lower=upper;
                            break;
                        }
                        upper=lower;
                        break;
                    }
                    int mid=lower+((upper-lower)/2);
                    if(l1[mid]>rem){
                        upper=mid-1;
                        continue;
                    }
                    lower=mid;
                    
                }
                if(l1[lower]>rem){
                    max=Math.max(max, i+1);
                    continue;
                }
                max=Math.max(max, (i+1)+(lower+1));
            }
            System.out.println(max);
        }
        
    }
    


}