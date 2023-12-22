import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();

		ArrayList<Integer> list = new ArrayList<Integer>();
		int i=1;
		list.add(s);
		while(true) {
			i++;
			if(s%2==0) {
				s = s/2;
			}else {
				s = 3*s+1;
			}
			if(list.contains(s)) {
				System.out.println(i);
				return;
			}
			list.add(s);
		}
	}
}