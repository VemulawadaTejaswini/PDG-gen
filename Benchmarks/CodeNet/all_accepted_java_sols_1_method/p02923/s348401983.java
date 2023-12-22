import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] H = new int[N];
		ArrayList <Integer> point = new ArrayList<Integer>();
		
		H[0] = stdIn.nextInt();
		for(int i = 1; i < N; i++) {
			H[i] = stdIn.nextInt();
			if(H[i-1] < H[i]) {
				point.add(i-1);
			}
		}
		point.add(N-1);
		
		int max = 0;
		if(point.get(0) > max) {
			max = point.get(0);
		}
		for(int i = 0; i < point.size()-1; i++) {
			if(point.get(i+1)-point.get(i)-1 > max) {
				max = point.get(i+1)-point.get(i)-1;
			}
		}
		
		System.out.println(max);

	}

}