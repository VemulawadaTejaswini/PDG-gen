import java.io.*;
import java.util.Arrays;
public class Main {
 public static void main(String[] args){
  try{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int a[];
   a=new int[100]; 
   while(true){
    String str[]=br.readLine().split(" ");
    int n=Integer.parseInt(str[0]);
    if(n==0)break;
    str=br.readLine().split(" ");
    for(int i=0;i<n;i++)a[i]=Integer.parseInt(str[i]);
    Arrays.sort(a,0,n-1);
    int idx=0,cnt=0;
    a[n]=-1;
    int f=0;
    for(int i=1;i<n+1;i++){
     if(a[i-1]==a[i]-1)cnt++;
     else{
      if(f!=0)System.out.print(" ");
      f=1;
      if(cnt==0){System.out.print(a[i]);idx++;}
      else {
       System.out.print(a[idx]);
       for(int j=idx+1;j<i;j++){
        System.out.print("-");
        System.out.print(a[j]);
       }
       idx=i;
      }
      cnt=0;
     }
    }//for
    System.out.print("\n");
   }
  } 
  catch(Exception e){return ;}
 }
}
