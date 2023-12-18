import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long[]r = new long[12];
		long i = n;
		int j = 12;
		while(i > 26) {
			r[j-1] = i / (long)Math.pow(26, j);
			int hantei = 0;
			for(int x=j; x>0; x--) {
				hantei += (int)Math.pow(26, x-1) * 26;
			}
			if(i == hantei)
					r[j-1] = 26;
			i = i % (int)Math.pow(26, j);
			//System.out.println(j + "," + r[j-1] + "," + i);
			j--;
		}

		for(int x=r.length-1; x>=0; x--) {
			isAlfabet(r[x]);
			//System.out.println(r[x]);
		}
		isAlfabet(i);
		//System.out.println(i);
	}

	private static void isAlfabet(long num) {
		String[] s = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
				"n","o","p","q","r","s","t","u","v","w","x","y","z"};
		if(num != 0) {
			System.out.print(s[(int)num-1]);
			//System.out.println(num);
		}
	}
}
