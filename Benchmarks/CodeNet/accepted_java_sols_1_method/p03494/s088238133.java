import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>(i);
		for(int j = 0; j < i; j++) {
			al.add(sc.nextInt());
		}
		me: while(true) {
			for(int t = 0; t < i; t++) {
				if(al.get(t) % 2 == 0) {
					al.set(t, al.get(t) / 2);
				}else {
					System.out.println(count);
					break me;
				}
			}
			count++;
		}
	}

}