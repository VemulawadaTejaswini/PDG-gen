import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> list_line = new ArrayList<Integer>();
		int count = 0;
		int count_high = 0;
		boolean isChain = false;
		boolean until = true;
		boolean unfinish  =false;

		for(int i = 0;i < n;i++) {
			list_line.add(scan.nextInt());
		}


		while(until) {
			for(int i = 0;i < n;i++) {
				if(count_high >= list_line.get(i)) {
					if(isChain) {
						isChain = false;
						count++;
					}

				}else {
					if(!isChain) {
						isChain = true;
					}
				}
			}
			count_high++;

			for(int i = 0;i < n;i++) {
				if(count_high < list_line.get(i)) {
					unfinish = true;
					break;
				}
			}

			if(!unfinish) {
				until = false;
			}

			if(isChain) {
				isChain = false;
				count++;
			}
			unfinish = false;
		}

		System.out.println(count);
	}
}
