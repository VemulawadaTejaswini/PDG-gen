import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {

		int n = Integer.parseInt(sc.nextLine());
		inpCommand(n);
		sc.close();

	}

	private static void inpCommand(int n) {
		String co = null;
		int index = 0;

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String[] strs = str.split(" ");


			co = strs[0];
				if (co.equals("insert") || co.equals("delete")) {
					index = Integer.parseInt(strs[1]);
				}


			switch (co) {
				case "insert":
					insert(index);
				continue;
				case "delete":
					delete(index);
				continue;
				case "deleteFirst":
					deleteFirst();
				continue;
				case "deleteLast":
					deleteLast();
				continue;
			}
		}

		for(int i = 0; i < Main.list.size();i++) {
			System.out.print(list.get(i));

				if (i < Main.list.size() - 1) {
					System.out.print(" ");
				}
		}

		System.out.println();

	}

	private static void deleteLast() {
		Main.list.remove(Main.list.size() - 1);

	}

	private static void deleteFirst() {
		Main.list.remove(0);

	}

	private static void delete(int index) {
		int order = 0;
		order = Main.list.indexOf(index);

		if (order > -1) {
			Main.list.remove(order);
		}

	}

	private static void insert(int index) {
		Main.list.add(0, index);

	}
}
