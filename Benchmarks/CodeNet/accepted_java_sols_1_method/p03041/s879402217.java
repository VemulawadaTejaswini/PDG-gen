import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		char[] li = sc.next().toCharArray();
		if(li[K-1] == 'A')li[K-1] = 'a';
		else if(li[K-1] == 'B') li[K-1] = 'b';
		else li[K-1] = 'c';
		System.out.println(String.valueOf(li));
	}
}