import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		String result = "";
		int score = 0;

		while(true) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();

			if(m == -1 && f == -1 && r == -1) {
				break;
			}

			score = m + f;

			if(m==-1 || f==-1) {
				result = "F";
			}else if(score >= 80) {
				result = "A";
			}else if(score >= 65) {
				result = "B";
			}else if(score >= 50) {
				result = "C";
			}else if(score >= 30) {
				if(r==-1 || r<50) {
					result = "D";
				}else if(r>=50) {
					result = "C";
				}
			}else {
				result = "F";
			}

			System.out.println(result);
		}

		sc.close();
	}
}
