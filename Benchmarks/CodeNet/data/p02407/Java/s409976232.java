import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] a = new int[len];
		for(int i = 0; i < len; i++)
			a[i] = sc.nextInt();
		for(int i = len - 1; i >= 0; i--){
			System.out.print(a[i]);
			if(i > 0)
				System.out.print(" ");
		}
	}
}