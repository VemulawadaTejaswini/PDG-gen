import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for(int i = 0; i < 5; i++) a[i]=Integer.parseInt(sc.next());
		
		int k = Integer.parseInt(sc.next());

		System.out.println(a[a.length-1] - a[0] <= k ? "Yay!" : ":(");
		
	}
}
