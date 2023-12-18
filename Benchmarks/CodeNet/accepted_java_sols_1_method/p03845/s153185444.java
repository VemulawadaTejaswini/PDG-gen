import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),m,sum=0,fsum=0;
    int[] t=new int[n];
    for(int i=0;i<n;i++){
      t[i]=sc.nextInt();
      sum+=t[i];
    }
    m=sc.nextInt();
    fsum=sum;
    int[] p=new int[m],x=new int[m];
    for(int i=0;i<m;i++){
      p[i]=sc.nextInt();
      x[i]=sc.nextInt();
      fsum=fsum-t[p[i]-1]+x[i];
      System.out.println(fsum);
      fsum=sum;
    }
  }
}
