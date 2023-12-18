import java.io.*;

class Main {
	public static void main (String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		String Index[] = {" ","',.!?","abcABC","defDEF","ghiGHI","jklJKL","mnoMNO","pqrsPQRS","tuvTUV","wxyzWXYZ"};

		try {
			while ((buf = br.readLine())!=null) {
				for (int i=0;i<buf.length();) {
					int k = 0;
					int j = Character.getNumericValue(buf.charAt(i));
					if (j==0) {
						i++;
						while (i<buf.length()&&Character.getNumericValue(buf.charAt(i))==j) {
							System.out.print(Index[j].charAt(0));
							i++;
						}
					} else {
						i++;
						while (i<buf.length()&&Character.getNumericValue(buf.charAt(i))==j) {
							i++;k++;
						}
						System.out.print(Index[j].charAt(k));
					}
				}
				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}