import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
//		n -= 1;
		String s = "";
		do {
			n -= 1;
			int z = (int)((n)%26);
			s = alphabet[z] + s;
			n /= 26;
		}while(n>0);
		System.out.println(s);
	}

}
