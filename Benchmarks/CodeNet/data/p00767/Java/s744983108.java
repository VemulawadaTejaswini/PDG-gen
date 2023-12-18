import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str1 = br.readLine();
			String str2 = br.readLine();
			int h = Integer.parseInt(str1);
			int w = Integer.parseInt(str2);

			if(h==0&&w==0) {
				System.exit(0);//
			}

			int base = 0;
			base = h * h + w * w;//デフォの二乗

			int newnew = 0;

			int newI = 150;
			int newJ = 150;

			for (int i = 1; i < 150; i++) {
				for (int j = 1; j < 150; j++) {

					if(i>j) {
						continue;
					}

					if(i==j) {
						continue;
					}
					newnew = (i*i)+(j*j);
					if (newnew > base) {
						if (((newI * newI)+(newJ*newJ) )>newnew) {
							newI = i;
							newJ = j;
						}
					}
				}
			}
			System.out.println(newI + " " + newJ);

		}

	}
}

