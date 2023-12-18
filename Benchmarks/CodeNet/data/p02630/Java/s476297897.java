import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),q,sum=0;
    int[] a=new int[n],x=new int[100001];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      x[a[i]]++;
      sum+=a[i];
    }
    
    q=sc.nextInt();
    int[] b=new int[q],c=new int[q],d=new int[q];
    for(int i=0;i<q;i++){
      b[i]=sc.nextInt();
      c[i]=sc.nextInt();
      d[i]=c[i]-b[i];
      sum=sum+x[b[i]]*d[i];
      System.out.println(sum);
      x[c[i]]+=x[b[i]];
      x[b[i]]=0;
    }
  }
}
