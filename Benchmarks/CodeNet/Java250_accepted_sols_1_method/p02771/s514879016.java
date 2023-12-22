import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
	
		if((A == B && B == C) || (A != B) && (B != C) && (A!= C)) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	

	}

}