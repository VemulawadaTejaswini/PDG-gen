import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[]r = new int[12];
		int i = n;
		int j = 12;
		while(i >= 26) {
			r[j-1] = i / (int)Math.pow(26, j);
			i = i % (int)Math.pow(26, j);
			j--;
		}

		for(int x=r.length-1; x>=0; x--) {
			isAlfabet(r[x]);
		}
		isAlfabet(i);
	}

	private static void isAlfabet(int num) {
		String[] s = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
				"n","o","p","q","r","s","t","u","v","w","x","z"};
		if(num != 0) {
			System.out.print(s[num-1]);
		}
	}
}
