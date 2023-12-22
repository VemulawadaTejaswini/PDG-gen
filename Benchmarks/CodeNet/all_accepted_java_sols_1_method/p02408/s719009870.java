import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());
		HashMap<Integer, String> spadeMap = new HashMap<Integer, String>();
		HashMap<Integer, String> heartMap = new HashMap<Integer, String>();
		HashMap<Integer, String> clubMap = new HashMap<Integer, String>();
		HashMap<Integer, String> daiyaMap = new HashMap<Integer, String>();
		ArrayList<Integer> spadeList = new ArrayList<Integer>();
		ArrayList<Integer> heartList = new ArrayList<Integer>();
		ArrayList<Integer> clubList = new ArrayList<Integer>();
		ArrayList<Integer> daiyaList = new ArrayList<Integer>();
		for (int i = 1; i < 14; i++) {
			spadeMap.put(i, "×");
			heartMap.put(i, "×");
			clubMap.put(i, "×");
			daiyaMap.put(i, "×");
		}
		for (int i = 0; i < count; i++) {
			String[] numArrays = br.readLine().split(" ");
			if ("S".equals(numArrays[0])) {
				spadeMap.put(Integer.parseInt(numArrays[1]), "◯");
			} else if ("H".equals(numArrays[0])) {
				heartMap.put(Integer.parseInt(numArrays[1]), "◯");
			} else if ("C".equals(numArrays[0])) {
				clubMap.put(Integer.parseInt(numArrays[1]), "◯");
			} else if ("D".equals(numArrays[0])) {
				daiyaMap.put(Integer.parseInt(numArrays[1]), "◯");
			}
		}
		for (Integer key: spadeMap.keySet()) {
			if ("×".equals(spadeMap.get(key))) {
				spadeList.add(key);
			}
		}
		Collections.sort(spadeList);
		for (Integer key: heartMap.keySet()) {
			if ("×".equals(heartMap.get(key))) {
				heartList.add(key);
			}
		}
		Collections.sort(heartList);
		for (Integer key: clubMap.keySet()) {
			if ("×".equals(clubMap.get(key))) {
				clubList.add(key);
			}
		}
		Collections.sort(clubList);
		for (Integer key: daiyaMap.keySet()) {
			if ("×".equals(daiyaMap.get(key))) {
				daiyaList.add(key);
			}
		}
		Collections.sort(daiyaList);
		for (int i = 0; i < spadeList.size(); i++) {
			System.out.println("S " + spadeList.get(i));
		}
		for (int i = 0; i < heartList.size(); i++) {
			System.out.println("H " + heartList.get(i));
		}
		for (int i = 0; i < clubList.size(); i++) {
			System.out.println("C " + clubList.get(i));
		}
		for (int i = 0; i < daiyaList.size(); i++) {
			System.out.println("D " + daiyaList.get(i));
		}
	}
}