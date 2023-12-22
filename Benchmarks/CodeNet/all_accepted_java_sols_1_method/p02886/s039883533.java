import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    
    int p=0;
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=s.nextInt();
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        p+=(a[i]*a[j]);
      }
    }
    System.out.println(p);
  }
}