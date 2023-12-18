import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String line = sc.next();
			int length = Integer.MAX_VALUE;
			while (line.replaceFirst("^.*\\[([0-9]*)\\].*$", "$1").length() != length) {
				String num = line.replaceFirst("^.*(\\[[0-9]*\\]).*$", "$1");
				num = num.replaceAll("[\\[\\]]", "");
				int tmp = Integer.parseInt(num);
				tmp = (tmp + 1) / 2;

				line = line.replaceAll("\\[" + num + "\\]", String.valueOf(tmp)
						+ " ");
				length = line.length();
			}
			while (line.indexOf("[") != -1) {
				String area = line.replaceFirst("^.*\\[([0-9 ]*)\\].*$", "$1");

				String[] areaS = area.trim().split(" ");
				int[] areaBox = new int[areaS.length];
				for (int j = 0; j < areaBox.length; j++) {
					areaBox[j] = Integer.parseInt(areaS[j]);
				}
				Arrays.sort(areaBox);
				int need = 0;
				for (int j = 0; j < (areaBox.length + 1) / 2; j++) {
					need += areaBox[j];
				}
				line = line.replaceAll("\\[" + area + "\\]",
						String.valueOf(need) + " ");
			}
			System.out.println(line);
		}
		sc.close();
	}
}