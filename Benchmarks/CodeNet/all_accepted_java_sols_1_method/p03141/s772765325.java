import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		List<int[]> list = new ArrayList<>();

		for(int i=1;i<=n;i++) {
			int ryouri[]=new int [4];
			ryouri[1] = Integer.parseInt(sc.next());
			ryouri[2] = Integer.parseInt(sc.next());
			ryouri[3] = ryouri[1]+ryouri[2];
			ryouri[0] = i;
			list.add(ryouri);
		}
		sc.close();
		list.sort((a1,a2)->a1[3]-a2[3]);
		Collections.reverse(list);
		boolean flag = true;
		long player1 = 0;
		long player2 = 0;

		for(int[] ryouri:list) {
			if(flag) {
				player1 += ryouri[1];
				flag = false;
			}else {
				player2 += ryouri[2];
				flag = true;
			}
		}

		System.out.println((player1 - player2));
	}

}
