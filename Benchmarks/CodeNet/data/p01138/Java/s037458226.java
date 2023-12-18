import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Comp comp = new Comp();
		while(true){
			int n = in.nextInt();
			if(n == 0) break;
			Queue<Integer> moving = new PriorityQueue<Integer>();
			int[][] car = new int[n][2];
			for(int i=0; i<n; i++){
				String[] time1 = in.next().split(":");
				String[] time2 = in.next().split(":");
				int t1 = 0;
				int t2 = 0;
				int base = 3600;
				for(int j=0; j<3; j++){
					t1 += Integer.parseInt(time1[j])*base;
					t2 += Integer.parseInt(time2[j])*base;
					base /= 60;
				}
				car[i][0] = t1;
				car[i][1] = t2;
			}
			Arrays.sort(car, comp);
			int res = 0;
			int stop = 0;
			for(int i=0; i<n; i++){
				while(!moving.isEmpty() && moving.peek()<=car[i][0]){
					moving.poll();
					stop++;
				}
				if(stop>0){
					stop--;
				}else{
					res++;
				}
				moving.add(car[i][1]);
			}
			System.out.println(res);
		}
	}
}

class Comp implements Comparator<int[]>{
	@Override
	public int compare(int[] o1, int[] o2) {
		return o1[0]-o2[0];
	}
}