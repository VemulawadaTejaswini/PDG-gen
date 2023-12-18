import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static byte[][] d;
	static final byte INF = Byte.MAX_VALUE;

	public static void main(String[] args) {

		PrintWriter out = new PrintWriter(System.out);
		Scanner scan = new Scanner(System.in);
		byte n = scan.nextByte();
		d = new byte[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				d[i][j] = i!=j ? INF : 0;
			}
		}
		for (int i = 0; i < n; i++) {
			byte id = scan.nextByte();
			byte c = scan.nextByte();
			for (int j = 0; j < c; j++) {
				d[id-1][scan.nextByte()-1]=1;
			}
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					d[i][j] = (byte)Math.min(d[i][j], d[i][k]+d[k][j]);
				}
			}
		}

		int p = scan.nextInt();
		for (int i = 0; i < p; i++) {
			byte s = scan.nextByte();
			byte g = scan.nextByte();
			short ttl = scan.nextShort();
			out.println(ttl<=d[s-1][g-1] || d[s-1][g-1]==INF ? "NA" : d[s-1][g-1]+1);
		}
		out.flush();
	}
}