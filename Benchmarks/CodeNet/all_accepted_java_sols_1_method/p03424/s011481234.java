import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean P = false;
		boolean W = false;
		boolean G = false;
		boolean Y = false;
		for(int i = 0; i < N; i++) {
			String c = sc.next();
			if(c.equals("P")) {
				P = true;
			}else if(c.equals("W")) {
				W = true;
			}else if(c.equals("G")) {
				G = true;
			}else if(c.equals("Y")) {
				Y = true;
			}
		}
		int answer = 0;
		if(P == true) {
			answer++;
		}
		if(W == true) {
			answer++;
		}
		if(G == true) {
			answer++;
		}
		if(Y == true) {
			answer++;
		}
		if(answer == 3) {
			System.out.println("Three");
		}else if(answer == 4) {
			System.out.println("Four");
		}
		
	}
}
