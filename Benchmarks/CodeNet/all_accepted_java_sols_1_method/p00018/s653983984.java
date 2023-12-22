import java.util.Arrays;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a[] = new int[5];
		for (int i = 0; i < 5; i++) {
			a[i] = stdIn.nextInt();
		}
		Arrays.sort(a);
		for(int i=4;-1<i;i--){
			System.out.print(a[i]);
			if(i!=0)
				System.out.print(" ");
			else
				System.out.println();
		}
	}
}