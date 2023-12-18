import java.io.*;
import java.util.*;
import java.lang.*;
import java.lang.Math;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int n=Integer.parseInt(scan.next());
    int[] x=new int[n];
    int[] y=new int[n];
    for(int i=0;i<n;i++){
      x[i]=Integer.parseInt(scan.next());
    }
    for(int i=0;i<n;i++){
      y[i]=Integer.parseInt(scan.next());
    }
    double ans1=0;
    double ans2=0;
    double ans3=0;
    double ans4=0;
    for(int i=0;i<x.length;i++){
      ans1+=Math.abs(x[i]-y[i]);
      ans2+=Math.pow(x[i]-y[i],2);
      ans3+=Math.pow(Math.abs(x[i]-y[i]),3);
      try{
        ans4=Math.max(Math.abs(x[i]-y[i]),Math.abs(x[i+1]-y[i+1]));
      }catch(Exception e){
      }
      if(i==x.length-1){
        ans2=Math.sqrt(ans2);
        ans3=Math.cbrt(ans3);
      }
    }

    System.out.printf("%.8f\n",ans1);
    System.out.printf("%.8f\n",ans2);
    System.out.printf("%.8f\n",ans3);
    System.out.printf("%.8f\n",ans4);
  }
}
