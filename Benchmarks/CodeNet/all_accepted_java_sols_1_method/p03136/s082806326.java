//b
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] l = new int[n];

		int max = 0;

		int index = 0;

		for(int i=0;i<n;i++) {

			l[i] = sc.nextInt();

			if(max<l[i]) {

				max = l[i];

				index = i;
			}
		}

		int sum = 0;

		for(int i=0;i<n;i++) {

			if(i!=index)sum+=l[i];
		}

		if(max<sum)System.out.println("Yes");

		else System.out.println("No");

	}

}
