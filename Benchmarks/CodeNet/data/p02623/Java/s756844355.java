import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt(),m=sc.nextInt();
	  long k=sc.nextLong(),sum=0,count=0;
	  long[] a=new long[n];
	  long[] b=new long[m];
	  for(int i=0;i<n;i++) {
		  a[i]=sc.nextLong();
	  }
	  for(int i=0;i<m;i++) {
		  b[i]=sc.nextLong();
	  }
	  int i=0,j=0;
	  while(sum<k) {
		  if(i>=n && j>=m)break;
		  if(i<=n-1&&a[i]<b[j]) {
			  sum+=a[i];
			  i++;
		  }else if(j<=m-1) {
			  sum+=b[j];
			  j++;
		  }
		  if(sum>k) {
			  break;
		  }
		  //System.out.println(sum);
		  count++;
	  }
	  System.out.println(count);
  }
}
