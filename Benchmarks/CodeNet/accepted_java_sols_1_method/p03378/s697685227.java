import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int x=sc.nextInt();
    int []a=new int [m];
    int j=0;
    int k=0;
    
    for (int i=0; i<a.length; i++){
      a[i]=sc.nextInt();
    }
    for (int i=0; i<a.length; i++){
      if(a[i]>x){j++;}
      if(a[i]<x){k++;}
    }
    if(j<=k){System.out.printf("%d\n", j);}
    else {System.out.printf("%d\n", k);}
  }
}
