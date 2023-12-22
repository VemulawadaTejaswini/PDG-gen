import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int whitecnt = 0;
		for(int i = 0;i < n;i ++) {
			char c = s.charAt(i);
			if(c == '.') whitecnt ++; //一旦全部黒にすることを考える
		}
		int cntmin = whitecnt, cnt = whitecnt;
		//前から徐々に白にする
		for(int i = 0;i < n;i ++) {
			char c = s.charAt(i);
			if(c == '.') cnt--; //黒にしてあったところ分のカウントを無くす
			else cnt++; //黒を白にする
			cntmin = Math.min(cnt, cntmin);
		}
		System.out.println(cntmin);
	}
}