import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();//整数1000<N<9999
		String val = String.valueOf(n);
		String data[] = new String[4];

		for(int i=0;i<val.length();i++) {
			data[i]=String.valueOf(val.charAt(i));
		}

		if(data[0].equals(data[1])&&data[0].equals(data[2])) {
			System.out.println("Yes");
		}else if(data[3].equals(data[2])&&data[3].equals(data[1])) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}