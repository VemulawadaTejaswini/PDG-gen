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
	  int i=0;
	  while(sum<k) {
		  if(i>=n)break;
		  sum+=a[i];
		  i++;
		  if(sum>k)break;
		  count++;
	  }
	  long[] a1=new long[n];
	  for(int g=0;g<n;g++) {
		  a1[g]=count;
		  count--;
		  if(count<0)break;
	  }
	  count=0;
	  sum=0;
	  i=0;
	  while(sum<k) {
		  if(i>=m)break;
		  sum+=b[i];
		  i++;
		  if(sum>k)break;
		  count++;
	  }
	  long[] b1=new long[m];
	  for(int g=0;g<m;g++) {
		  b1[g]=count;
		  count--;
		  if(count<0)break;
	  }
	  int j=0;
	  i=0;
	  count=0;
	  sum=0;
	  while(sum<k) {
		  if(i>=n&&j>=m)break;
		  if(i<=n-1&&j<=m-1) {
			  if(a1[i]>b1[j]) {
				  sum+=a[i];
				  i++;
			  }else if(b1[j]>a[i]){
				  sum+=b[j];
				  j++;
			  }else {
				  if(a[i]<b[j]) {
					  sum+=a[i];
					  i++;
				  }else {
					  sum+=b[j];
					  j++;
				  }
			  }
		  }else if(i<=n-1) {
			  sum+=a[i];
			  i++;
		  }else {
			  sum+=b[j];
			  j++;
		  }
		  if(sum>k)break;
		  count++;
		  //System.out.println(sum);
	  }
	  System.out.println(count);
  }
}
