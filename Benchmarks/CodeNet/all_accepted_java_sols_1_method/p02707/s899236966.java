import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    long[] a=new long[n];
    for(int i=0;i<n-1;i++)a[sc.nextInt()-1]++;
    for(int i=0;i<n;i++)System.out.println(a[i]);
    
  }
}
