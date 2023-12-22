import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int num = 0;
		for(int i=0;i<4;i++) {
			char nowChar = str.charAt(i);
			if(nowChar=='+') {
				num++;
			}else if(nowChar=='-') {
				num--;
			}
		}
		System.out.println(num);
	}
}
