import java.util.*;
public class Main {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] a=new int[n];
      int[] num=new int[100010];
      int sum=0;
      for(int i=0;i<n;i++){
      	a[i]=sc.nextInt();
        sum+=a[i];
        num[a[i]-1]++;
      }
      int q=sc.nextInt();
      int b=0;
      int c=0;
      for(int i=0;i<q;i++){
      	b=sc.nextInt();
        c=sc.nextInt();
        sum=sum+(c-b)*num[b-1];
        System.out.println(sum);
        num[c-1]+=num[b-1];
        num[b-1]=0;
      }
	}
}