import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	public static int H,W;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		int SIZE = 155;

		int index_table[][] = new int[SIZE+1][SIZE+1];

		PriorityQueue<Info> Q = new PriorityQueue<Info>();
		ArrayList<Info> list = new ArrayList<Info>();

		for(int h = 1; h <= SIZE-1; h++){
			for(int w = h+1; w <= SIZE; w++){

				Q.add(new Info(h,w));
			}
		}

		int index = 0;

		while(!Q.isEmpty()){

			index_table[Q.peek().H][Q.peek().W] = index++;
			list.add(Q.peek());
			Q.poll();
		}

		StringBuilder ans = new StringBuilder();

		while(true){

			H = scanner.nextInt();
			W = scanner.nextInt();

			if(H == 0 && W == 0)break;

			int tmp_index = index_table[H][W]+1;

			ans.append(Integer.toString(list.get(tmp_index).H)).append(" ").
				append(Integer.toString(list.get(tmp_index).W)).append("\n");
		}

		System.out.print(ans.toString());
	}
}

class Info implements Comparable<Info>{

	Info(){

		H = W = 0;
		value = 0;
	}

	Info(int arg_H,int arg_W){
		H = arg_H;
		W = arg_W;
		value = H*H+W*W;
	}

	 public int compareTo(Info arg){
        if(this.value < arg.value)return -1;
        if(this.value > arg.value)return 1;
        if(this.H < arg.H)return -1;
        if(this.H > arg.H) return 1;
        return 0;
    }

	public int H;
	public int W;
	public int value;
}
