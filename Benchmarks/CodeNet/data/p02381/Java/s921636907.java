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
      double m=sum/n;
      double hensa=0;
      for(int i=0;i<n;i++){
        hensa+=Math.pow(s[i]-m,2);
        if(i==n-1){
          System.out.println(Math.sqrt(hensa/n));
        }
      }
    }
  }
}
