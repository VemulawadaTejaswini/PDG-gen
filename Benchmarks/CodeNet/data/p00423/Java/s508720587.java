import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		int dataNum;
		int aNum = 0, bNum = 0;
		int aPoint = 0, bPoint = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str = br.readLine();

			dataNum = Integer.parseInt(str);
			if (dataNum == 0) {
				break;
			}

			aPoint = 0;
			bPoint = 0;
			aNum = 0;
			bNum = 0;
			for (int i = 0; i < dataNum; i++) {
				StringBuffer sb = new StringBuffer(new String(br.readLine()));
				aNum = Character.getNumericValue(sb.charAt(0));
				bNum = Character.getNumericValue(sb.charAt(2));

				if (aNum > bNum) {
					aPoint += aNum + bNum;
				} else if (bNum > aNum) {
					bPoint += aNum + bNum;
				} else {
					aPoint += aNum;
					bPoint += bNum;
				}
			}

			System.out.println(aPoint + " " + bPoint);
		}
	}
}
