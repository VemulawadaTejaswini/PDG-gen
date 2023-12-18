import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();

		List<Queue<Integer>> queueList = new ArrayList<Queue<Integer>>();
		for(int i = 0; i < n; i++) {
			queueList.add(new PriorityQueue<Integer>(Comparator.reverseOrder()));
		}

		for(int i = 0; i < q; i++)	{
			int query = sc.nextInt();
			int t = sc.nextInt();

			switch(query){
			case 0:
				int x = sc.nextInt();
				queueList.get(t).add(x);
				break;

			case 1:  //getMax(t)
				if(!(queueList.get(t).isEmpty())) System.out.println(queueList.get(t).peek());
				break;

			case 2:  //deleteMax(t)
				if(!(queueList.get(t).isEmpty())) queueList.get(t).poll();
				break;
			}
		}
	}

}

