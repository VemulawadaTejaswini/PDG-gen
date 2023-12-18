import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int[] a=new int[n];
    int b=0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      b+=a[i];
    }
    Arrays.sort(a);
    x-=b;
    int c=x/a[0];
    System.out.println(n+c);
  }
}