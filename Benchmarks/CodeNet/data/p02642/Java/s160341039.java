import java.util.Arrays;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt(),count=0;
	  int[] a=new int[n];
	  for(int i=0;i<n;i++)a[i]=sc.nextInt();
	  Arrays.sort(a);
	  for(int i=n-1;i>0;i--) {
		  boolean flag=true;
		  for(int j=i-1;j>=0;j--) {
			  if(a[i]%a[j]==0)flag=false;
		  }
		  if(flag)count++;
	  }
	  if(n==1 || a[0]!=a[1])count++;
	  System.out.println(count);
  }
}

