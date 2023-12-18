import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		int n, k;
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
		k = Integer.parseInt(sc.next());
		System.out.println(Integer.toString(n, k).length());
	}
}