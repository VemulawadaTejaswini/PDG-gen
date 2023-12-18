import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       long[] arr=new long[n];
       long[] pre=new long[n];
       long ss=0;
       for(int i=0;i<n;i++){
        arr[i]=s.nextLong();
        ss+=arr[i];
       }
       pre[0]=arr[0];
       for(int i=1;i<n;i++){
        pre[i]=pre[i-1]+arr[i];
      }
        long res=Long.MAX_VALUE;
      for(int i=0;i<n;i++){
        res=Math.min(res,Math.abs(ss-pre[i]-pre[i]));
      }
       
        System.out.println(res);
        }
    }
