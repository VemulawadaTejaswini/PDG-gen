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

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nums = br.readLine().split(" ");

		Dice cont = new Dice(nums);

		cont.settatelist(tatelist);
		cont.setyokolist(yokolist);
		cont.setaroundlist(aroundlist);

		String n = br.readLine();

		String[] oder ;

		int k, p ,l;

		StringBuilder builder = new StringBuilder();

		boolean judge = false;

		for (int i = 0; i < Integer.parseInt(n); i++) {

			oder = br.readLine().split(" ");

			judge =false;
			p=0;

			for( k=0; k<yokolist.size();k++){
				if(Integer.parseInt(oder[0]) == (int)yokolist.get(k)){
					break;
				}
				judge = true;
			}
			if(judge){
				if(Integer.parseInt(oder[0]) == (int)tatelist.get(1)){
					p =1;
				}else if (Integer.parseInt(oder[0]) == (int)tatelist.get(3)) {
					p=3;

				}
			}
			/*System.out.print(k+" "+p);*/

			switch (k+p) {
			case 5/*'N'*/:
				tatelist.add(tatelist.get(0));
				tatelist.remove(0);
				yokolist.set(0, tatelist.get(0));
				yokolist.set(2, tatelist.get(2));
				aroundlist.set(0,tatelist.get(1));
				aroundlist.set(2,tatelist.get(3));
				break;
			case 7/*'S'*/:
				tatelist.add(0, tatelist.get(3));
				tatelist.remove(4);
				yokolist.set(0, tatelist.get(0));
				yokolist.set(2, tatelist.get(2));
				aroundlist.set(0, tatelist.get(1));
				aroundlist.set(2, tatelist.get(3));
				break;
			case 3/*'E'*/:
				yokolist.add(0, yokolist.get(3));
				yokolist.remove(4);
				tatelist.set(0, yokolist.get(0));
				tatelist.set(2, yokolist.get(2));
				aroundlist.set(1,yokolist.get(1));
				aroundlist.set(3, yokolist.get(3));
				break;
			case 1/*'W'*/:
				yokolist.add(yokolist.get(0));
				yokolist.remove(0);
				tatelist.set(0, yokolist.get(0));
				tatelist.set(2, yokolist.get(2));
				aroundlist.set(1, yokolist.get(1));
				aroundlist.set(3, yokolist.get(3));
				break;
			case 2/*'W'*/:
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
/*			for(Integer L :yokolist){
				System.out.print(L);
			}
			System.out.println(" ");
			for(Integer L: tatelist){
				System.out.print(L);
			}*/
			for( l=0; l<aroundlist.size();l++){
				/*System.out.println(aroundlist.get(l));*/
				if(Integer.parseInt(oder[1]) == (int)aroundlist.get(l)){
					if(l ==3){
						l=-1;
					}
					builder.append(aroundlist.get(l+1)+"\n");
				/*	System.out.println(cont.getnum(aroundlist.get(l+1)-1));*/
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
				aroundlist.add(0,aroundlist.get(3));
				aroundlist.remove(4);
				tatelist.set(1, aroundlist.get(0));
				tatelist.set(3, aroundlist.get(2));
				yokolist.set(1, aroundlist.get(1));
				yokolist.set(3, aroundlist.get(3));
				break;

			default:
				break;
			}

		}

		System.out.print(builder.toString());
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