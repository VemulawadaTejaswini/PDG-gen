import java.util.*;
public class Main{
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String zeroS = S.replace("ABC", "0");
		int count = 0;
		for (char c : zeroS.toCharArray()) {
			if (c == '0') {
				count++;
			}
		}
		System.out.println(count);
	}
}