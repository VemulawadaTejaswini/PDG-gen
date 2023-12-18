import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double a[]=new double[n];
    double x=0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      x+=(1/a[i]);
    }
    sc.close();
    System.out.println((1/x));
  }
}