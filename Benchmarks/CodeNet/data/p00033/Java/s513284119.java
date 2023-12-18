import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String n = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(n); i++) {
			String[] str = sc.nextLine().split(" ");
			int[] list = new int[10];
			ArrayList<Integer> listA = new ArrayList<Integer>();
			ArrayList<Integer> listB = new ArrayList<Integer>();
			listA.add(0);
			listB.add(0);
			for (int j = 0; j < str.length; j++) {
				list[j] = Integer.parseInt(str[j]);
			}
			for (int j = 0; j < list.length; j++) {
				if(list[j] - listA.get(listA.size() - 1) > 0){
					listA.add(list[j]);
				} else if(list[j] - listB.get(listB.size() - 1) > 0){
					listB.add(list[j]);
				} else {
					System.out.println("NO");
					break;
				}

				if(list.length - 1 == j){
					System.out.println("YES");
				}
			}
		}
	}
}