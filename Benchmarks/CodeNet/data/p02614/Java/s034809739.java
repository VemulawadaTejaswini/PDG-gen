import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

		 int h = s.nextInt();
		 int w = s.nextInt();
		 int k = s.nextInt();

		 String[][] str = new String[h][w];

		 int result = 0;

		 for(int i = 0; i < h; i++) {
			 String tmp = s.next();
			 for(int j = 0; j < w; j++) {
				 str[i][j] = tmp.substring(j, j + 1);
			 }
		 }

		 for(int i = 0; i < (int)Math.pow(2, h); i++) {
			 for(int j = 0; j < (int)Math.pow(2, w); j++) {
				 String row = (String)Integer.toBinaryString(i);
				 row = row.format("%" + h + "s", row).replace(" ", "0");
				 row = row.substring(0, h);
				 String col = (String)Integer.toBinaryString(j);
				 col = col.format("%" + w + "s", col).replace(" ", "0");
				 col = col.substring(0, w);

				 int tmpCount = 0;
				 for(int m = 0; m < row.length(); m++) {
					 if (m > h - 1 || "0".equals(row.substring(m, m+1))) {
						 continue;
					 }
					 for(int n = 0; n < col.length(); n++) {
						 if(n > w - 1) {
							 break;
						 }
						 if("1".equals(col.substring(n, n+1))) {
							 if("#".equals(str[m][n])) {
								 tmpCount++;
							 }
						 }
					 }
				 }
				 if(tmpCount == k) {
					 result++;
				 }
			 }
		 }

		 System.out.println(result);
	}

}
