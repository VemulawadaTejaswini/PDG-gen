import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = Integer.parseInt(sc.next());
		int sy = Integer.parseInt(sc.next());
		int tx = Integer.parseInt(sc.next());
		int ty = Integer.parseInt(sc.next());

		int sumx = tx-sx;
		int sumy = ty-sy;

		StringBuilder res = new StringBuilder();

		for(int i=0;i<sumy;i++) {
			res.append("U");
		}
		for(int i=0;i<sumx;i++) {
			res.append("R");
		}
		for(int i=0;i<sumy;i++) {
			res.append("D");
		}
		for(int i=0;i<sumx+1;i++) {
			res.append("L");
		}
		for(int i=0;i<sumy+1;i++) {
			res.append("U");
		}
		for(int i=0;i<sumx+1;i++) {
			res.append("R");
		}
		res.append("DR");
		for(int i=0;i<sumy+1;i++) {
			res.append("D");
		}
		for(int i=0;i<sumx+1;i++) {
			res.append("L");
		}
		res.append("U");

		System.out.println(res);

	}

}
