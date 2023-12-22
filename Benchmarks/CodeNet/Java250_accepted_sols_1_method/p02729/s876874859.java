import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int nres=1,mres=1;
    for(int i=n;i>(n-2);i--) nres*=i;
    for(int i=m;i>(m-2);i--) mres*=i;
    nres/=2;
    mres/=2;
    System.out.println(nres+mres);                             
  }
}