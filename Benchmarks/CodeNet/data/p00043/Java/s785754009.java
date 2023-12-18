import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	private int[] nico;
	private int[] tmp;
	
	private ArrayList<Integer> pungal;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		while (sc.hasNextLine() == true) {
			String line = sc.nextLine();
			ArrayList<Integer> al = new ArrayList<Integer>();
			
			for (int i = 0; i < 9; i++) {
				nico = new int[9];
				for (int j = 0; j < line.length(); j++) {
					nico[line.charAt(j) - '1']++;
				}
				nico[i]++;
				
				pungal = new ArrayList<Integer>();
				
				boolean flag = false;
				for (int j = 0; j < nico.length; j++) {
					if (nico[j] >= 3) pungal.add(j);
					if (nico[j] > 4) flag = true;
				}
				if (flag == true) continue;
				
				if (judge() == true) al.add(i + 1);
			}
			
			if (al.size() == 0) {
				System.out.println("0");
			} else {
				System.out.print(al.get(0));
				for (int i = 1; i < al.size(); i++) {
					System.out.print(" " + al.get(i));
				}
				System.out.println();
			}
		}
	}
	
	private boolean judge() {
		tmp = Arrays.copyOf(nico, nico.length);

		return pung(0);
	}
	
	private boolean pung(int counter) {
		if (counter == pungal.size()) {
			return pair();
		}

		if (pung(counter + 1) == true) return true;
		
		tmp[pungal.get(counter)] = tmp[pungal.get(counter)] - 3;
		if (pung(counter + 1) == true) {
			tmp[pungal.get(counter)] = tmp[pungal.get(counter)] + 3;
			return true;
		}
		
		tmp[pungal.get(counter)] = tmp[pungal.get(counter)] + 3;
		return false;
	}
	
	private boolean pair() {
		for (int i = 0; i < tmp.length; i++) {
			if (tmp[i] >= 2) {
				tmp[i] = tmp[i] - 2;
				if (chow() == true) {
					tmp[i] = tmp[i] + 2;
					return true;
				}
				
				tmp[i] = tmp[i] + 2;
			}
		}
		return false;
	}
	
	private boolean chow() {
		int[] test = Arrays.copyOf(tmp, tmp.length);
		for (int i = 0; i < test.length - 2; i++) {
			if (test[i] > 0) {
				test[i]--;
				test[i + 1]--;
				test[i + 2]--;
				
				i = 0;
			}
		}
		
		for (int i = 0; i < test.length; i++) {
			if (test[i] != 0) return false;
		}
		
		return true;
	}
}