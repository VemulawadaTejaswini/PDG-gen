import java.util.Arrays;
import java.util.Scanner;

//A Milk Shop
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[] a = new int[n];
			for(int i=0;i<n;i++)a[i]=sc.nextInt();
			Arrays.sort(a);
			int s = 0;
			int t = 0;
			for(int i=0;i<n;i++){
				s += t;
				t += a[i];
			}
			System.out.println(s);
		}
	}
}