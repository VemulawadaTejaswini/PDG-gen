import java.io.*;
import java.util.*;
import java.lang.*;
import java.lang.Math;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    while(true){
      int n=Integer.parseInt(scan.next());
      if(n==0)break;
      int[] s=new int[n];
      for(int i=0;i<n;i++){
        s[i]=Integer.parseInt(scan.next());
      }
      int sum=0;
      for(int i=0;i<n;i++){
        sum+=s[i];
      }
      double heikin=sum/n;

      double a=0;
      for(int i=1;i<=n;i++){
        a+=Math.pow(s[i-1]-heikin,2);
      }
      System.out.printf("%.8f",Math.sqrt(a/n));
    }
  }
}
