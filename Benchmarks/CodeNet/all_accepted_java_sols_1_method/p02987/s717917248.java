import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = "No";
		String[] ar = a.split("");
		if(ar[0].equals(ar[1])) {
			if(ar[2].equals(ar[3])){
				b = "Yes";
			}
		}else if(ar[0].equals(ar[2])) {
			if(ar[1].equals(ar[3])){
				b = "Yes";
			}
		}else if(ar[0].equals(ar[3])) {
			if(ar[1].equals(ar[2])){
				b = "Yes";
			}
		}
		if(ar[0].equals(ar[1]) &&ar[0].equals(ar[2])&&ar[0].equals(ar[3])) {
			b = "No";
		}
			System.out.println(b);

	}
}