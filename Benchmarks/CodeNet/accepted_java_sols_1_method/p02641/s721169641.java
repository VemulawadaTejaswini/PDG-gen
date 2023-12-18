import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int seisu = scan.nextInt();
		int len = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		int min = Integer.MAX_VALUE;
		int ans = 0;

		for(int i=0;i<len;i++) {
			list.add(scan.nextInt());
		}

		for(int i=0;i<=110;i++) {
			if(!list.contains(i)) {
				if(min > Math.abs(i-seisu)) {
				min = Math.abs(i-seisu);
				ans = i;
				}
			}

		}
		System.out.println(ans);
		scan.close();

	}

}
