import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] aArrays = br.readLine().split(" ");
		ArrayList<ArrayList<Integer>> itiKaiso = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> niKaiso = new ArrayList<Integer>();
		for (int i = 0; i < Integer.parseInt(aArrays[0]); i++) {
			String[] aLine = br.readLine().split(" ");
			for (int j = 0; j < Integer.parseInt(aArrays[1]); j++) {
				niKaiso.add(Integer.parseInt(aLine[j]));
			}
			itiKaiso.add(niKaiso);
			niKaiso = new ArrayList<Integer>();
		}
		ArrayList<Integer> bArraysList = new ArrayList<Integer>();
		for (int i = 0; i < Integer.parseInt(aArrays[1]); i++) {
			Integer bNum = Integer.parseInt(br.readLine());
			bArraysList.add(bNum);
		}
		ArrayList<Integer> cArrayList = new ArrayList<Integer>();
		for (int i = 0; i < Integer.parseInt(aArrays[0]); i++) {
			Integer sum = 0;
			for (int j = 0; j < Integer.parseInt(aArrays[1]); j++) {
				sum += itiKaiso.get(i).get(j) * bArraysList.get(j);
			}
			cArrayList.add(sum);
		}
		for (int i = 0; i < cArrayList.size(); i++) {
			System.out.println(cArrayList.get(i));
		}
	}
}