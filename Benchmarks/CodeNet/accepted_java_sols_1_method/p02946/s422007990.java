import java.util.*;

class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int K = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		
      	int k = K - 1;
      
      	for(int i = X - k;i<=X+k;i++) {
			System.out.println(i);
        }
	}
}
