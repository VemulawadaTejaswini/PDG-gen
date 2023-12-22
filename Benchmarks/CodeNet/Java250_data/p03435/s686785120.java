import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		boolean key = false;
		for (int i = 0; i < 9; i++) num[i] = sc.nextInt();
		for (int a1 = 0; a1 <= 100 ; a1++) {
			int b1 = num[0] - a1;
			int b2 = num[1] - a1;
			int b3 = num[2] - a1;
			int a2 = num[3] - b1;
			int a3 = num[6] - b1;
			if (a2 + b2 == num[4] 
					&& a2 + b3 == num[5] 
					&& a3 + b2 == num[7] 
					&& a3 + b3 == num[8]) {
				key = true;
				break;
			}
		}
		System.out.println(key?"Yes":"No");
	}
}
