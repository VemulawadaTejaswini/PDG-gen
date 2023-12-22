import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strRC = br.readLine().split(" ");
		ArrayList<Integer> niKaiso = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> itiKaiso = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < Integer.parseInt(strRC[0]) + 1; i++) {
			if (i == Integer.parseInt(strRC[0])) {
				for (int j = 0; j < Integer.parseInt(strRC[1]) + 1; j++) {
					Integer sum = 0;
					for (int k = 0; k < Integer.parseInt(strRC[0]); k++) {
						sum += itiKaiso.get(k).get(j);
					}
					niKaiso.add(sum);
				}
				itiKaiso.add(niKaiso);
			} else {
				String line = br.readLine();
				String[] lineArrays = line.split(" ");
				for (int j = 0; j < Integer.parseInt(strRC[1]) + 1; j++) {
					if (j == Integer.parseInt(strRC[1])) {
						Integer sum = 0;
						for (int k = 0; k < niKaiso.size(); k++) {
							sum += niKaiso.get(k);
						}
						niKaiso.add(sum);
					} else {
						niKaiso.add(Integer.parseInt(lineArrays[j]));
					}
				}
				itiKaiso.add(niKaiso);
				niKaiso = new ArrayList<Integer>();
			}
		}
		for (int i = 0; i < Integer.parseInt(strRC[0]) + 1; i++) {
			for (int j = 0; j < Integer.parseInt(strRC[1]) + 1; j++) {
				if (j == Integer.parseInt(strRC[1])) {
					System.out.println(itiKaiso.get(i).get(j));
				} else {
					System.out.print(itiKaiso.get(i).get(j) + " ");
				}
			}
		}
	}
}