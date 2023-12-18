import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i < N; i ++) {
			a.add(stdIn.nextInt());
		}
		
		Collections.sort(a);
		
		int alice = 0;
		int bob = 0;
		for(int i = a.size() - 1; 0 <= i; i --) {
			alice += a.get(i);
			if(0 <= i - 1) {
				i --;
				bob += a.get(i);
			}
		}
		System.out.println(alice - bob);
	}

}