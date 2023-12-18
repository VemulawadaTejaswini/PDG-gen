import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	private boolean[] state;
	private long[] sum;
	private List<Integer> onstate;

	private int N;
	private boolean flag;

	private void mainrun() {

		scan = new Scanner(System.in);

		state = new boolean[4001];
		sum = new long[4001];
		onstate = new ArrayList<Integer>();

		while(true){
			N = scan.nextInt();

			if(N == 0) {
				break;
			}
			Arrays.fill(sum,0);
			Arrays.fill(state,false);
			
			onstate.clear();
			
			flag = false;
			
			for(int i = 0;i < N;i++){
				looprun();
			}

			onstate.sort((e1,e2)->(e1 > e2 ? 1 : 0));

			for(Integer num : onstate) {
				if(sum[num] >= 1000000) {
					flag = true;
					System.out.println(num);
				}
			}
			if(!flag) {
				System.out.println("NA");
			}

			

		}


	}


	private void looprun() {
		int e = scan.nextInt();
		long p = scan.nextInt();
		long q = scan.nextInt();

		if(!state[e]) {
			state[e] = true;
			onstate.add(e);
		}

		sum[e] += p * q;
	}

}
