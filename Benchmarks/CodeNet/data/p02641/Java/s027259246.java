import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int num = scn.nextInt();
			int cnt = scn.nextInt();
			if(cnt < 1) {
				System.out.println(num);
				return;
			}
			Set<Integer> nums = new HashSet<>();
			for(int i=0; i<cnt; i++) {
				nums.add(scn.nextInt());
			}

			for(int i=1; ; i++) {
				int tgt=num-i;
				if(!nums.contains(tgt)) {
					System.out.println(tgt);
					break;
				}
				tgt=num+i;
				if(!nums.contains(tgt)) {
					System.out.println(tgt);
					break;
				}
			}
		}
	}
}
