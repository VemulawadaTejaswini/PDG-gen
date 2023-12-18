import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt(), len = sc.nextInt(), one = 0;
		int[] n = new int[num];
		for(int i = 0; i < num; i++) {
			n[i] = sc.nextInt();
			if(n[i] == 1)one = i;
		}
		int s = one, t = num-1-one, as = s/(len-1), at=t/(len-1);
		int amari = num - (as+at)*(len-1);
		if(amari == 1) {
			System.out.println(as+at);
		} else if(amari <= len) {
			System.out.println(as+at+1);
		} else {
			System.out.println(as+at+2);
		}
	}
}