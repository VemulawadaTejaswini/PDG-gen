import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		char[] input = sc.next().toCharArray();
		ArrayList<Integer> ws = new ArrayList<Integer>();
		ArrayList<Integer> rs = new ArrayList<Integer>();

		for(int i=0;i<N;i++) {
			if(input[i]=='W') {
				ws.add(i);
			}else {
				rs.add(i);
			}
		}
		int wInd = 0, rInd = rs.size() - 1;
		int count = 0;
		while(wInd<ws.size()&&rInd>=0&& ws.get(wInd)<rs.get(rInd)) {
			count++;
			wInd++;
			rInd--;
		}
		
		System.out.println(count);
		

	}

}