import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Main {

	public static void main(String[] args) throws IOException {

		List<Dice> Dices = new LinkedList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String n = br.readLine();

		for (int i = 0; i < Integer.parseInt(n); i++) {
			String[] nums = br.readLine().split(" ");

			Dice cont = new Dice(nums);

			cont.settatelist();
			cont.setyokolist();
			cont.setaroundlist();

			Dices.add(cont);

		}
		int m =0;
		int final_judge = 0 ;
		for (int i = 0; i < Dices.size(); i++) {
			for (int k = 1+m; k < Dices.size(); k++) {
				final_judge += Compare_Dices(Dices.get(i).getyokolist(), Dices.get(i).gettatelist(), Dices.get(i).getaroudlist(),
						Dices.get(k).gettatelist(), Dices.get(k).getyokolist());

			}
			m++;
		}
		if(final_judge ==0){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}

	public static int Compare_Dices(List<Integer> yokolist, List<Integer> tatelist, List<Integer> aroundlist,
			List<Integer> tatelist2, List<Integer> yokolist2) {
		boolean judge2 = true;

		boolean judge = false;

		int k, p, l;

		for (k = 0; k < yokolist.size(); k++) {
			judge = true;
			p = 0;
			if (tatelist2.get(0) == yokolist.get(k)) {
				judge = false;
			}

			if (judge) {
				if (tatelist2.get(0) == tatelist.get(1)) {
					p = 1;
				} else if (tatelist2.get(0) == tatelist.get(3)) {
					p = 3;

				}
			}
			switch (k) {
			case 3/* 'E' */:
				yokolist.add(0, yokolist.get(3));
				yokolist.remove(4);
				tatelist.set(0, yokolist.get(0));
				tatelist.set(2, yokolist.get(2));
				aroundlist.set(1, yokolist.get(1));
				aroundlist.set(3, yokolist.get(3));
				break;
			case 1/* 'W' */:
				yokolist.add(yokolist.get(0));
				yokolist.remove(0);
				tatelist.set(0, yokolist.get(0));
				tatelist.set(2, yokolist.get(2));
				aroundlist.set(1, yokolist.get(1));
				aroundlist.set(3, yokolist.get(3));
				break;
			case 2/* 'W' */:
				yokolist.add(yokolist.get(2));
				yokolist.add(yokolist.get(3));
				yokolist.add(yokolist.get(0));
				yokolist.add(yokolist.get(1));
				yokolist.remove(0);
				yokolist.remove(0);
				yokolist.remove(0);
				yokolist.remove(0);
				tatelist.set(0, yokolist.get(0));
				tatelist.set(2, yokolist.get(2));
				aroundlist.set(1, yokolist.get(1));
				aroundlist.set(3, yokolist.get(3));
				break;
			}
			switch (p) {
			case 1/* 'N' */:
				tatelist.add(tatelist.get(0));
				tatelist.remove(0);
				yokolist.set(0, tatelist.get(0));
				yokolist.set(2, tatelist.get(2));
				aroundlist.set(0, tatelist.get(1));
				aroundlist.set(2, tatelist.get(3));
				break;
			case 3/* 'S' */:
				tatelist.add(0, tatelist.get(3));
				tatelist.remove(4);
				yokolist.set(0, tatelist.get(0));
				yokolist.set(2, tatelist.get(2));
				aroundlist.set(0, tatelist.get(1));
				aroundlist.set(2, tatelist.get(3));
				break;
			}

			for (l = 0; l < aroundlist.size(); l++) {
				if (tatelist2.get(1) == aroundlist.get(l)) {
					if (l == 3) {
						l = -1;
					}
					break;
				}
			}
			switch (l) {
			case 1:
				aroundlist.add(aroundlist.get(0));
				aroundlist.remove(0);
				tatelist.set(1, aroundlist.get(0));
				tatelist.set(3, aroundlist.get(2));
				yokolist.set(1, aroundlist.get(1));
				yokolist.set(3, aroundlist.get(3));
				break;
			case 2:
				aroundlist.add(aroundlist.get(0));
				aroundlist.add(aroundlist.get(1));
				aroundlist.remove(0);
				aroundlist.remove(0);
				tatelist.set(1, aroundlist.get(0));
				tatelist.set(3, aroundlist.get(2));
				yokolist.set(1, aroundlist.get(1));
				yokolist.set(3, aroundlist.get(3));
				break;
			case 3:
				aroundlist.add(0, aroundlist.get(3));
				aroundlist.remove(4);
				tatelist.set(1, aroundlist.get(0));
				tatelist.set(3, aroundlist.get(2));
				yokolist.set(1, aroundlist.get(1));
				yokolist.set(3, aroundlist.get(3));
				break;

			default:
				break;
			}

			for (int i = 0; i < tatelist.size(); i++) {
				if ((tatelist.get(i) == tatelist2.get(i)) && (yokolist.get(i) == yokolist2.get(i))) {
					judge2 = true;
				} else {
					judge2 = false;
					break;
				}
			}
			if (judge2) {
				break;
			}
		}

		if (judge2) {
			return 1;

		} else {
			return 0;
		}

	}

}

class Dice {
	int[] nums;

	List<Integer> tatelist = new LinkedList<>(Arrays.asList(1, 2, 6, 5));

	List<Integer> yokolist = new LinkedList<>(Arrays.asList(1, 3, 6, 4));

	List<Integer> aroundlist = new LinkedList<>(Arrays.asList(2, 3, 5, 4));

	Dice(String[] s) {
		nums = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			nums[i] = Integer.parseInt(s[i]);
		}
	}

	void settatelist() {

		for (int i = 0; i < tatelist.size(); i++) {

			this.tatelist.set(i, nums[this.tatelist.get(i) - 1]);
		}
	}

	void setyokolist() {

		for (int i = 0; i < yokolist.size(); i++) {

			this.yokolist.set(i, nums[yokolist.get(i) - 1]);
		}
	}

	void setaroundlist() {

		for (int i = 0; i < aroundlist.size(); i++) {

			aroundlist.set(i, nums[aroundlist.get(i) - 1]);
		}
	}

	List<Integer> gettatelist() {
		return tatelist;
	}

	List<Integer> getyokolist() {
		return yokolist;
	}

	List<Integer> getaroudlist() {
		return aroundlist;
	}

}