import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) throws IOException {
		ArrayList<ArrayList<ArrayList<String>>> itiKaiso = new ArrayList<ArrayList<ArrayList<String>>>();
		ArrayList<ArrayList<String>> niKaiso = new ArrayList<ArrayList<String>>();
		ArrayList<String> sanKaiso = new ArrayList<String>();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 3 && i == 3) {
					break;
				}
				if (j == 3 && i < 3) {
					for (int l = 0; l < 20; l++) {
						sanKaiso.add("#");
					}
				} else {
					for (int l = 0; l < 10; l++) {
						sanKaiso.add(" 0");
					}
				}
				niKaiso.add(sanKaiso);
				sanKaiso = new ArrayList<String>();
			}
			itiKaiso.add(niKaiso);
			niKaiso = new ArrayList<ArrayList<String>>();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer infoCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < infoCount; i++) {
			String[] strIndexs = br.readLine().split(" ");
			Integer addNum = Integer.parseInt(itiKaiso.get(Integer.parseInt(strIndexs[0]) - 1)
					.get(Integer.parseInt(strIndexs[1]) - 1).get(Integer.parseInt(strIndexs[2]) - 1)
					.substring(
							itiKaiso.get(Integer.parseInt(strIndexs[0]) - 1)
							.get(Integer.parseInt(strIndexs[1]) - 1).get(Integer.parseInt(strIndexs[2]) - 1)
							.length() - 1)) + Integer.parseInt(strIndexs[3]);
			if (addNum < 0) {
				itiKaiso.get(Integer.parseInt(strIndexs[0]) - 1).get(Integer.parseInt(strIndexs[1]) - 1)
				.set(Integer.parseInt(strIndexs[2]) - 1, " 0");
			} else {
				itiKaiso.get(Integer.parseInt(strIndexs[0]) - 1).get(Integer.parseInt(strIndexs[1]) - 1)
				.set(Integer.parseInt(strIndexs[2]) - 1, " " + String.valueOf(addNum));
			}
			addNum = 0;
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 3 && i == 3) {
					break;
				}
				if (j == 3) {
					for (int k = 0; k < 20; k++) {
						if (k == 19) {
							System.out.println(itiKaiso.get(i).get(j).get(k));
						} else {
							System.out.print(itiKaiso.get(i).get(j).get(k));
						}
					}
				} else {
					for (int k = 0; k < 10; k++) {
						if (k == 9) {
							System.out.println(itiKaiso.get(i).get(j).get(k));
						} else {
							System.out.print(itiKaiso.get(i).get(j).get(k));
						}
					}
				}
			}
		}
	}
}