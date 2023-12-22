import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),m=sc.nextInt(),f=0;
  	int[] a=new int[m],b=new int[m],e=new int[n],g=new int[n];
  	long[] h=new long[n];
  	for(int i=0;i<n;i++){
  		h[i]=sc.nextLong();
  		e[i]=0;
  		g[i]=0;
  	}
  	for(int i=0;i<m;i++){
  		a[i]=sc.nextInt();
  		b[i]=sc.nextInt();
  	}
  	for(int i=0;i<m;i++){
  		e[a[i]-1]++;
  		e[b[i]-1]++;
  		if(h[a[i]-1]>h[b[i]-1]){
  			g[a[i]-1]++;
  		}else if(h[a[i]-1]<h[b[i]-1]){
  			g[b[i]-1]++;
  		}
  	}
  	for(int i=0;i<n;i++){
  		if(e[i]==g[i]){
  			f++;
  		}
  	}
  	System.out.print(f);
  }
}