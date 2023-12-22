import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int a[]=new int[i];
		for(int j=0;j<i;j++) {
			a[j]=sc.nextInt();
		}
		Arrays.sort(a);
		long sum=0;
		for(int j=0;j<i;j++) {
			sum+=a[j];
		}
		System.out.println(a[0]+" "+a[i-1]+" "+sum);

	}

}

