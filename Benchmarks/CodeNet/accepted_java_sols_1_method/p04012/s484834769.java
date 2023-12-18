import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] w  = sc.next().split("");
		if(w.length %2 !=0) {
			System.out.println("No");
			return;
		}
		Arrays.sort(w);
		int count = 1;
		String compare = w[0];
		for(int i =1;i <w.length;i++) {
			if(!compare.equals(w[i])) {
				if(count %2 !=0) {
					System.out.println("No");
					return;
				}
				compare = w[i];
				count =1;
			}else {
				count++;
			}
			if(i == w.length-1) {
				if(count %2 !=0) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}