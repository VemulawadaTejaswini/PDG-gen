import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String yohou = scan.next();
		String jissai = scan.next();

		String[] y = new String[yohou.length()];
		String[] j = new String[yohou.length()];

		int k = 0;

		for(int i=0;i<yohou.length();i++) {
			y[i] = yohou.substring(i, i+1);
		}
		for(int i=0;i<jissai.length();i++) {
			j[i] = jissai.substring(i, i+1);
		}

		for(int i=0;i<yohou.length();i++) {
			if(y[i].equals(j[i])) {
				k += 1;
			}
		}
		System.out.println(k);
	}

}
