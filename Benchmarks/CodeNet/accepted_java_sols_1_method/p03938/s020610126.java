import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] p = new int[n];
    for(int i=0;i<n;i++)p[i]=sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int[] r = new int[n];
    for(int i=0;i<n;i++)r[p[i]-1]=i;
    for(int i=0;i<n;i++){
      a[i]=30000*(i+1);
      b[i]=30000*(n-i)+r[i];
    }
    System.out.print(a[0]);
    for(int i=1;i<n;i++)System.out.print(" "+a[i]);
    System.out.println("");
    System.out.print(b[0]);
    for(int i=1;i<n;i++)System.out.print(" "+b[i]);
    System.out.println("");
  }
}