import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n;
		while((n=sc.nextInt())!=0){
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			long sum=0;
			long add=0;
			for(int i=1;i<n;i++){
				add+=a[i-1];
				sum+=add;
			}
			System.out.println(sum);
		}
	}
}