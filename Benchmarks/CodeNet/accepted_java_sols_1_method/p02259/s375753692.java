import java.util.*;
class Main {
	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int aryLen = scan.nextInt();
		int[] ary = new int[aryLen];
		boolean flag = true;
		for(int i = 0 ; i < aryLen; i++) {
			ary[i] = scan.nextInt();
		}
		while(flag) {
			flag = false;
			for(int n = aryLen-1; n > 0; n--) {
			int tmp = ary[n];
				if(ary[n] < ary[n-1]) {
					ary[n] = ary[n-1];
					ary[n-1] = tmp;
					flag = true;
					count++;
				}
			}
		}
		for(int i = 0 ; i < aryLen; i++) {
			System.out.print(ary[i]);
			if(i != aryLen-1){
				System.out.print(" ");
			} else {
				System.out.println();
		    }
		}
		System.out.println(count);
	}
}
