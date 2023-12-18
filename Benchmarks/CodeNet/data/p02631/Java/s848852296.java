import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		long [] arr=new long[n];
		long x=0;
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
			x=(x^arr[i]);
		}
		for(int i=0;i<n;i++){
			System.out.print((x^arr[i])+" ");
		}
	}
}