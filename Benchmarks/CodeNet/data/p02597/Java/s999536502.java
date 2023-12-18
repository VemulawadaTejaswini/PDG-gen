import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int sum = 0;
		int ans = 0;
		int whiteZantei = 0;
		int redZantei = 0;
		Deque<Integer> white = new ArrayDeque<Integer>();
		Deque<Integer> red = new ArrayDeque<Integer>();
		boolean last = true; //true white  false red
		for(int i = 0 ; i < n ; i++) {
			if(s.charAt(i) == 'W') {
				sum++;
				whiteZantei++;
				last = true;
				if(redZantei != 0) {
					red.push(redZantei);
					redZantei = 0;
				}
			}
			else {
				last = false;
				redZantei++;
				if(whiteZantei != 0) {
					white.push(whiteZantei);
					whiteZantei = 0;
				}
				}
		}
		if(redZantei != 0) {
			red.push(redZantei);
		}
		else
			white.push(whiteZantei);
		int sum2 = 0;

		while(!white.isEmpty() && !red.isEmpty()) {
			if(last) {
				sum -= white.pop();


				last = !last;
			}
			else {
				int i = red.pop();
				sum2 += i;
				if(sum2 >= sum)
					break;
              last = !last;
			}
		}

		sc.close();
		System.out.println(sum);

	}
}

