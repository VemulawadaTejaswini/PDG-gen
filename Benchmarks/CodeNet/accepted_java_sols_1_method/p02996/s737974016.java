import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<int[]> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int[] tmp = {in.nextInt(),in.nextInt()};
			list.add(tmp);
		}
		list.sort((e1,e2)->-e2[1]+e1[1]);
		long now = 0;
		boolean success = true;
		for(int i=0;i<n;i++) {
			now += list.get(i)[0];
			if(now>list.get(i)[1]) {
				success = false;
				break;
			}
		}
		System.out.println(success?"Yes":"No");
		in.close();

	}

}
