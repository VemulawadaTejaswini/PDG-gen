import java.util.*;

public class Main {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int a[]=new int[n];
		for(int s=0;s<n;s++){
			a[s]=sc.nextInt();
		}
		double total=0;

		for(int s=0;s<n;s++){
			total+=(double)1/a[s];
		}

		
		System.out.println((double)1/total);

	}
}
