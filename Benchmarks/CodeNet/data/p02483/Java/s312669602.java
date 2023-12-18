import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();

			ArrayList<Integer> list = insertList(x, y, z);
			Collections.sort(list);
			
			System.out.print(list.get(0));
			System.out.print(" ");
			System.out.print(list.get(1));
			System.out.print(" ");
			System.out.print(list.get(2));
			System.out.print("\n");
    }

    /** listを返すメソッド */
	private static ArrayList<Integer> insertList(int x, int y, int z) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(x);
		list.add(y);
		list.add(z);
		return list;
	}
}