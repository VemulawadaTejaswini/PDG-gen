import java.io.*;

public class Main {

	private static final int subNum = 3;
	private static final int adge1 = 0;
	private static final int adge2 = 1;
	private static final int adge3 = 2;

	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] tryangle = new int[num][subNum];

		for (int i = 0; i < num; i++) {

			String str = br.readLine();
			String[] strBuf = str.split(" ");

			for (int j = 0; j < subNum; j++) {
				tryangle[i][j] = Integer.parseInt(strBuf[j]);
			}
		}
		
		int x, y, z;
		for (int i = 0; i < num; i++) {
			x = tryangle[i][adge1] * tryangle[i][adge1];
			y = tryangle[i][adge2] * tryangle[i][adge2];
			z = tryangle[i][adge3] * tryangle[i][adge3];
			if (((x + y) == z) || ((y + z) == x) || ((x + z) == y))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}