import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Main {

	public static void main(String[] args) throws IOException {

		List<Integer> tatelist = new LinkedList<>(Arrays.asList(1, 2, 6, 5));

		List<Integer> yokolist = new LinkedList<>(Arrays.asList(1, 3, 6, 4));

		List<Integer> aroundlist = new LinkedList<>(Arrays.asList(2, 3, 5, 4));

		List<Integer> tatelist2 = new LinkedList<>(Arrays.asList(1, 2, 6, 5));

		List<Integer> yokolist2 = new LinkedList<>(Arrays.asList(1, 3, 6, 4));

		List<Integer> aroundlist2 = new LinkedList<>(Arrays.asList(2, 3, 5, 4));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nums = br.readLine().split(" ");

		Dice cont = new Dice(nums);

		cont.settatelist(tatelist);
		cont.setyokolist(yokolist);
		cont.setaroundlist(aroundlist);

		nums = br.readLine().split(" ");

		Dice cont2 = new Dice(nums);
		cont2.settatelist(tatelist2);
		cont2.setyokolist(yokolist2);
		cont2.setaroundlist(aroundlist2);

		if(((yokolist.get(0)+yokolist.get(2)) == (yokolist2.get(0)+yokolist2.get(2))) &&
				((yokolist.get(1)+yokolist.get(3)) == (yokolist2.get(1)+yokolist2.get(3))) &&
				((tatelist.get(1)+tatelist.get(3)) == (tatelist2.get(1)+tatelist2.get(3))) ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}

}

class Dice {
	int[] nums;

	Dice(String[] s) {
		nums = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			nums[i] = Integer.parseInt(s[i]);
		}
	}

	void settatelist(List<Integer> list){

		for(int i =0; i<list.size(); i++){

		list.set(i, nums[list.get(i)-1]);
		}
	}
	void setyokolist(List<Integer> list){

		for(int i =0; i<list.size(); i++){

		list.set(i, nums[list.get(i)-1]);
		}
	}
	void setaroundlist(List<Integer> list){

		for(int i =0; i<list.size(); i++){

		list.set(i, nums[list.get(i)-1]);
		}
	}
/*
	int getnum(int i) {

		return nums[i];

	}*/

}