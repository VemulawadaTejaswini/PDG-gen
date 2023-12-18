
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());//int型
		int K = Integer.parseInt(sc.next());
		String sline = sc.next();
		String[] sl = new String[N];
		for (int i=0; i<N; i++){
			sl[i] = String.valueOf(sline.charAt(i));
		}
		
		sl[K-1] = sl[K-1].toLowerCase();
		for (int i=0; i<N; i++){
			System.out.print(sl[i]);
		}
	}

}
