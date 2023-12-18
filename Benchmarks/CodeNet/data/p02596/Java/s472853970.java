import java.util.*;

public class Main {

	public static void main(String[] args){
		int x = 1;
		long y = 7;
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		while(y % k != 0) {
			if(k < 7 && k % 2 == 0) {
				x = -1;
				break;
			}
			y = y * 10 + 7;
			x += 1;
		}
		System.out.print(x);
		sc.close();
	}

}