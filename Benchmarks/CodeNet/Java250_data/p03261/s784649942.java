import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		boolean flag = false;
		char s = '0';

		first: for(int i = 0; i < n; i++) {
			list.add(sc.next());
			if(list.size() > 1) {
				if(s != list.get(i).charAt(0)) {
					break;
				}for(int j = 0; j < i; j++) {
					if(list.get(j).equals(list.get(i))) {
						break first;
					}
				}
			}
			s = list.get(i).charAt(list.get(i).length()-1);
			if(i == n-1)flag = true;
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}