
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int sx,sy,tx,ty;
		sx = Integer.parseInt(sc.next());
		sy = Integer.parseInt(sc.next());
		tx = Integer.parseInt(sc.next());
		ty = Integer.parseInt(sc.next());
		for(int i=0;i<tx-sx;i++) {
			out.print("R");
		}
		for(int i=0;i<ty-sy;i++) {
			out.print("U");
		}
		for(int i=0;i<tx-sx;i++) {
			out.print("L");
		}
		for(int i=0;i<ty-sy;i++) {
			out.print("D");
		}
		out.print("D");
		out.print("R");
		for(int i=0;i<tx-sx;i++) {
			out.print("R");
		}
		for(int i=0;i<ty-sy;i++) {
			out.print("U");
		}
		out.print("U");
		out.print("L");
		out.print("U");
		out.print("L");
		for(int i=0;i<tx-sx;i++) {
			out.print("L");
		}
		for(int i=0;i<ty-sy;i++) {
			out.print("D");
		}
		out.print("D");
		out.print("R");
		
		out.flush();
	}
	
}
