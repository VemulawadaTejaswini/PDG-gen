import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) { //WOOOOOOO AtCoder is HELPING!!!!!!!!!!
		//Arraylist cheese for the win
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		long ans = 0;
		ArrayList<Long> deductions = new ArrayList<Long>();
		for (int i = 0; i < N; i++) {
			long x = input.nextLong();
			ans+=x;
			while (x>0) {
				long sub = x-x/2;
				deductions.add(sub);
				x/=2;
			}
		}
		Collections.sort(deductions);
		int index = deductions.size()-1;
		int cnt = 0;
		while (cnt < M) {
			ans-=deductions.get(index);
			cnt++;
			index--;
			if (index==-1) break;
		}
		System.out.println(ans);
	}
}