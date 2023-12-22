

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{

	/*
	 * ???52???
	 *
	 * ???????????????????????????????????????????????? ??????????????? ???n <= 52???
	 *
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ?????±??\???
		String card = sc.next();
		int rank = Integer.parseInt(card);

		ArrayList<Integer> S_card = new ArrayList<Integer>(); // ????????????
		ArrayList<Integer> H_card = new ArrayList<Integer>(); // ?????????
		ArrayList<Integer> C_card = new ArrayList<Integer>(); // ?????????
		ArrayList<Integer> D_card = new ArrayList<Integer>(); // ?????????

		for (int i = 0; i < rank; i++) {
			// ??????
			String shape = sc.next();
			String no = sc.next();
			int choice = Integer.parseInt(no);
			if (shape.equals("S")) {
				S_card.add(choice);
			} else if (shape.equals("H")) {
				H_card.add(choice);
			} else if (shape.equals("C")) {
				C_card.add(choice);
			} else if (shape.equals("D")) {
				D_card.add(choice);
			}
		}

		// ??¢?´¢
		// ?¶???????????????????

		String[] cardShape = new String[] { "S", "H", "C", "D" };
		String swi = "";
		for (int i = 0; i < cardShape.length; i++) {
			swi = cardShape[i];
			if (swi == "S")
				swi_method(swi, S_card);
			else if(swi == "H")
				swi_method(swi, H_card);
			else if(swi == "C")
				swi_method(swi, C_card);
			else
				swi_method(swi, D_card);

		}

	}

	static void check(String cardShape, ArrayList<Integer> cArd_N) {
		Collections.sort(cArd_N);

		

		boolean[] chk_arr = new boolean[13];
		for (int i = 1; i <= 13; i++) {
			for (int j = 0; j < cArd_N.size(); j++) {
				if (i == cArd_N.get(j))
					chk_arr[i-1] = true;
			}
		}
		for (int j = 0; j < chk_arr.length; j++) {
			if (chk_arr[j] == false)
				System.out.println(cardShape + " " + (j + 1));
		}
	}

	static void swi_method(String swi, ArrayList<Integer> cArd_N) {
		switch (swi) {
		case "S":
			check(swi, cArd_N);
			break;
		case "H":
			check(swi, cArd_N);
			break;
		case "C":
			check(swi, cArd_N);
			break;
		case "D":
			check(swi, cArd_N);
			break;
		}
	}
}