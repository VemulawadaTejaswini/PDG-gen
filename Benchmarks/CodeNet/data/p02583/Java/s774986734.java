import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;

		for(int i = 0;i < n;i++) {
			list.add(scan.nextInt());
		}

		for(int i = 0;i < n;i++) {
			for(int j = i;j < n;j++) {
				for(int k = j;k < n;k++) {
					if(list.get(i) == list.get(j) || list.get(j) == list.get(k) || list.get(i) == list.get(k)) {
						continue;
					}

					if(list.get(i) + list.get(j) > list.get(k) && list.get(j) + list.get(k) > list.get(i) && list.get(k) + list.get(i) > list.get(j)) {
						count++;
					}
				}
			}
		}

		System.out.println(count);
	}
}
