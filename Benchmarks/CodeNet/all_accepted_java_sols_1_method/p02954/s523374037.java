import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String N = stdIn.next();
		char[] C = N.toCharArray();
		int len = C.length;
		int[] c = new int[len];
		Arrays.fill(c,0);
		
		ArrayList<Integer> point = new ArrayList<Integer>();
		point.add(0);
		for(int i = 0; i < len-1; i++) {
			if(C[i] == 'R' && C[i+1] == 'L') point.add(i);
			else if(C[i] == 'L' && C[i+1] == 'R') point.add(i+1);
		}
		point.add(len);
		
		for(int i = 1; i < point.size(); i += 2) {
			if((point.get(i)-point.get(i-1)+1)%2 == 0) {
				c[point.get(i)] += (point.get(i)-point.get(i-1)+1)/2;
				c[point.get(i)+1] += (point.get(i)-point.get(i-1)+1)/2;
			}
			else {
				c[point.get(i)] += ((point.get(i)-point.get(i-1)+1)/2)+1;
				c[point.get(i)+1] += (point.get(i)-point.get(i-1)+1)/2;
			}
			
			if((point.get(i+1)-point.get(i)-1)%2 == 0) {
				c[point.get(i)] += (point.get(i+1)-point.get(i)-1)/2;
				c[point.get(i)+1] += (point.get(i+1)-point.get(i)-1)/2;
			}
			else {
				c[point.get(i)] += (point.get(i+1)-point.get(i)-1)/2;
				c[point.get(i)+1] += ((point.get(i+1)-point.get(i)-1)/2)+1;
			}
		}
		
		for(int i = 0; i < len; i++) {
			System.out.println(c[i]);
		}
	}

}