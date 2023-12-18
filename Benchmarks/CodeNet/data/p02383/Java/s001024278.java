import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Main {

	public static void main(String[] args) throws IOException {

		List<Integer> tatelist = new LinkedList<>(Arrays.asList(1,2,6,5));

		List<Integer> yokolist = new LinkedList<>(Arrays.asList(1,3,6,4));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nums = br.readLine().split(" ");

		Dice cont = new Dice(nums);

		String oder = br.readLine();

		for(int i=0; i<oder.length(); i++){
			switch (oder.charAt(i)) {
			case 'N':
				tatelist.add(tatelist.get(0));
				tatelist.remove(0);
				yokolist.set(0, tatelist.get(0));
				yokolist.set(2, tatelist.get(2));
				break;
			case 'S':
				tatelist.add(0, tatelist.get(3));
				tatelist.remove(4);
				yokolist.set(0,tatelist.get(0));
				yokolist.set(2, tatelist.get(2));
				break;
			case 'E':
				yokolist.add(0,yokolist.get(3));
				yokolist.remove(4);
				tatelist.set(0,yokolist.get(0));
				tatelist.set(2,yokolist.get(2));
				break;
			case 'W':
				yokolist.add(yokolist.get(0));
				yokolist.remove(0);
				tatelist.set(0,yokolist.get(0));
				tatelist.set(2,yokolist.get(2));
				break;
			}
		}
		for(Integer l : yokolist){
			System.out.print(l);
		}
		System.out.println("");
		for(Integer l: tatelist){
			System.out.print(l);
		}
/*		System.out.println(co0nt.getnum(yokolist.get(0)-1));*/
	}

}

class  Dice{
	int[] nums;

	Dice(String[] s){

		nums = new int[s.length];
		for(int i=0; i<s.length;i++){
			nums[i] = Integer.parseInt(s[i]);
		}
	}

	int getnum(int i){


		return nums[i];

	}


}