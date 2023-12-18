import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x;
		int y;
		int z;
		String line = br.readLine();
		line = br.readLine();
		while (line != null) {
			String strArray[] = line.split(" ");
			x = Integer.valueOf(strArray[0]);
			y = Integer.valueOf(strArray[1]);
			z = Integer.valueOf(strArray[2]);
			String Anser = "NO";
			if (x % 3 == 0 && (y % 4 ==0 && z % 5 == 0) || (y % 5 == 0 && z % 4 ==0)) {
				Anser = "YES";
			} else if (x % 4 == 0 && (y % 3 ==0 && z % 5 == 0) || (y % 5 == 0 && z % 3 ==0)) {
				Anser = "YES";
			} else if (x % 5 == 0 && (y % 4 ==0 && z % 3 == 0) || (y % 3 == 0 && z % 4 ==0)) {
				Anser = "YES";
			}
			System.out.println(Anser);
			line = br.readLine();
		}
    }
}