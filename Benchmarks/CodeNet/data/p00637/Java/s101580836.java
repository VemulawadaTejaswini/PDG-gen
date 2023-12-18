import java.io.*;
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

    int idx=0,cnt=0,f=0;
    for(int i=1;i<n;i++){
     if(a[i-1]==a[i]-1)cnt++;
     else{
      if(f!=0)System.out.print(" ");
      f=1;
      if(cnt==0){System.out.print(a[i-1]);idx++;}
      else {
       System.out.print(a[idx]);
       System.out.print("-");
       System.out.print(a[i-1]);
       idx=i;
      }
      cnt=0;
     }
    }//for
    if(cnt!=0){
     if(f!=0)System.out.print(" ");
     System.out.print(a[idx]);
     System.out.print("-");
    }
    if(f==1)System.out.print(" ");
    System.out.print(a[n-1]);
    System.out.print("\n");
   }
  } 
  catch(Exception e){return ;}
 }
}
