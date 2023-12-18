import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			ArrayList<Integer> tmp = new ArrayList<>();
			list.add(tmp);
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int command = sc.nextInt();
			int t = sc.nextInt();
			switch (command) {
				case 0:
					int x = sc.nextInt();
					list.get(t).add(x);
					break;
				
				case 1:
					int listsize = list.get(t).size();
					if(listsize > 0) {
						for (int j = 0; j < listsize -1; j++) {	
							System.out.print(list.get(t).get(j) + " ");
						}
						System.out.println(list.get(t).get(listsize -1));
					} else {
						System.out.println();
					}
					break;
				
				case 2:
					list.get(t).clear();
					break;					
			}
		}
	}
}

