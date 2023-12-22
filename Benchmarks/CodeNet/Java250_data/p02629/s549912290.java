import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();

		String[] list = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

		String ans = "";

		while(n>0) {
			long m = n%26L;
			if(m==0) {
				m = 26L;
			}
			ans = list[(int) (m-1)]+ans;
			n = (n-m)/26L;
		}
		System.out.println(ans);



	}
}
