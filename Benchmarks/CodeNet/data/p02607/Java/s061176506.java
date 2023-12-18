import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt(),count=0;
	  int[] a=new int[n];
	  for(int i=0;i<n;i++)a[i]=sc.nextInt();
	  for(int i=0;i<n;i+=2) {
		  if(a[i]%2!=0)count++;
	  }
	  System.out.println(count);
  }
}
