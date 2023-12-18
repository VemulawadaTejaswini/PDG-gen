import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int sumr[];
    int sumc[];
    int a[][];
    int sum=0;
    sumr=new int[r];
    sumc=new int[c];
    a=new int[r][c];
    for(int i=0;i<r;i++) sumr[i]=0;
    for(int j=0;j<c;j++) sumc[j]=0;
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        a[i][j]=sc.nextInt();
        sumr[i]+=a[i][j];
        sumc[j]+=a[i][j];
        sum+=a[i][j];
      }
    }
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        System.out.print(a[i][j]+" ");
      }
      System.out.println(sumr[i]);
    }
    for(int j=0;j<c;j++){
      System.out.print(sumc[j]+" ");
    }
    System.out.println(sum);
  }
}

