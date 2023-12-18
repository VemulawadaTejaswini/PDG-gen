import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String ph = new String();

		
			while(sc.hasNext()) {
				ph = sc.nextLine();
				if  (ph.equals("0")) break; 
				System.out.printf("%d\n", CalcScore(ph));
			}

	}
	
	public static int CalcScore(String dk) {
		int[] score = {0, 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		int max = 0;
		int min = 0;
		String[] plh = new String[5];
		ArrayList<Integer> ph = new ArrayList<Integer>();
		int cntAce = 0;
		
			plh = dk.split(" ");
				for (String s : plh) {
					ph.add(Integer.parseInt(s));
						if (Integer.parseInt(s) == 1) {
							++cntAce;
						}
				}
			
			for (int cd : ph) {
				max += score[cd];
				
					if (cd == 1) {
						min += 1;
					} else {
						min += score[cd];
					}
			}
			
			int tmp = min;
			
			for (int i = 0; i < cntAce; i++) {
				tmp += 10;
					if (tmp > 21)  {
						break;
					} else {
						min = tmp;
					}
				
			}
			
		if (max > 21) max = 0;
		if (min > 21) min = 0;
			
		return Math.max(max, min);
	}
}
