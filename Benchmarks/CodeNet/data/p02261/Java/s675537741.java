import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Card {
	String name;
	int value;
	
	Card(String name) {
		this.name = name;
		value = Integer.parseInt(name.substring(1));
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class Main {
	public static String listToString(List<Card> list) {
		StringBuilder sb = new StringBuilder();
		for (Card c : list) {
			sb.append(c);
			sb.append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append('\n');
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader br = new BufferedReader(new FileReader("in1.txt"));
		// BufferedReader br = new BufferedReader(new FileReader("in2.txt"));
		int N = Integer.parseInt(br.readLine());
		List<Card> C1 = new ArrayList<Card>();
		String[] line = br.readLine().split(" ");
		for (String name : line)
			C1.add(new Card(name));
		List<Card> C2 = new ArrayList<Card>();
		C2.addAll(C1);
		
		for (int i = 0; i < N - 1; i++) {
			// C1[0..i - 1]??????????????????
			for (int j = N - 1; j > 0; j--) {
				if (C1.get(j).value < C1.get(j - 1).value) {
					Card tmp = C1.get(j - 1);
					C1.set(j - 1, C1.get(j));
					C1.set(j, tmp);
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			// C2[0..i-1]??????????????????
			int mini = i;
			for (int j = i + 1; j < N; j++)
				if (C2.get(j).value < C2.get(mini).value)
					mini = j;
			Card tmp = C2.get(i);
			C2.set(i, C2.get(mini));
			C2.set(mini, tmp);
		}
		
		System.out.print(listToString(C1));
		System.out.println("Stable");
		System.out.print(listToString(C2));
		boolean is_stable = true;
		for (int i = 0; i < N; i++)
			if (C1.get(i) != C2.get(i)) {
				is_stable = false;
				break;
			}
		System.out.println(is_stable ? "Stable" : "Not stable");
	}
}