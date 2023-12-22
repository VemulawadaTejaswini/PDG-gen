import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		String str = null;
		int count = 0;
		for(;a <= b; a++) {
			str = String.valueOf(a);
			if(str.equals(new StringBuilder(str).reverse().toString())) count++;
		}
		System.out.println(count);
	}
}
