import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		double d =0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			d+=(1.0/arr[i]);
		}	
		System.out.println(1.0/d);
	}
}