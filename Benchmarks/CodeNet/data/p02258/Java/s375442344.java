import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(in.nextInt());
		}

		int max = list.get(1) -list.get(0);
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				int x =list.get(j)-list.get(i);
				if(max < x){
					max = x;
				}
			}
		}
		System.out.println(max);
	}
}