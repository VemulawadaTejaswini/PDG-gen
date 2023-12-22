import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),m=sc.nextInt();
    int[] a=new int[m],b=new int[m],f=new int[n];
    for(int i=0;i<n;i++){
      f[i]=0;
    }
    for(int i=0;i<m;i++){
      a[i]=sc.nextInt();
      b[i]=sc.nextInt();
      f[a[i]-1]++;
      f[b[i]-1]++;
    }
    for(int i=0;i<n;i++){
      System.out.println(f[i]);
    }
  }
}
