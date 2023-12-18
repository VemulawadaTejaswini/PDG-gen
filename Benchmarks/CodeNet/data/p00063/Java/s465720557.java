
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		while(sc.hasNext()){
			String str = sc.next();
			String STR = "";
			StringBuilder sb = new StringBuilder(str.length());
			sb.append(str);
			STR = sb.reverse().toString();
			if(STR.equals(str))cnt++;
		}
		System.out.println(cnt);
	}
}
