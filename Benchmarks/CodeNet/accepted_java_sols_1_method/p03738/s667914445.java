import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = sc.next().split("");
		String[] b = sc.next().split("");
		if(a.length > b.length) {
			System.out.println("GREATER");
			return;
		}
		if(a.length < b.length) {
			System.out.println("LESS");
			return;
		}
		for(int i =0;i < a.length;i++) {
			if(Integer.valueOf(a[i]) >Integer.valueOf(b[i])) {
				System.out.println("GREATER");
				return;
			}

			if(Integer.valueOf(a[i]) <Integer.valueOf(b[i])) {
				System.out.println("LESS");
				return;
			}
		}
		System.out.println("EQUAL");
	}
}