import java.io.IOException;

public class Main {
	public static void main(String[] hoge) throws IOException {
		StringBuilder ans = new StringBuilder();
		int[] index = new int[] {-1, -1, -1, -1};
		int cha;
		int counter =0;
		while ( (cha = System.in.read()) != -1) {
			if (cha == '0') {
				counter++;
			} else if (cha == '1') {
				counter++;
				for (int i=0; i < 4; i++) {
					if (index[i] == -1) {
						index[i] = counter;
						break;
					}
				}
			}

			if (counter == 64) {
				ans.append(getans(index) + "\n");
				index = new int[] { -1, -1, -1, -1 };
				counter = 0;
			}
		}

		System.out.println(ans);
	}

	public static String getans(int[] index) {
		if (index[0]+1 == index[1]) {
			if (index[1]+1 == index[2]) {
				return "C";
			} else if (index[1]+7 == index[2]) {
				return "A";
			} else if (index[1]+8 == index[2]) {
				return "E";
			} else if (index[1]+6 == index[2]) {
				return "G";
			}
		} else if (index[0]+8 == index[1]) {
			return "B";
		} else if (index[0]+7 == index[1]) {
			return "D";
		} else if (index[0]+8 == index[1]) {
			return "F";
		}
		return "hoge";
	}
}