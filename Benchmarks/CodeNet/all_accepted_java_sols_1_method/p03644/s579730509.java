import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rs = 2;
		int N = scan.nextInt();
		for(int i = 0; i < 7; i++) {
			if(N == 1) break;
			if(N < rs) break; 
			rs = rs * 2;
		}
		if(N == 1) System.out.println(1);
		else System.out.println(rs / 2);
		scan.close();
	}
}