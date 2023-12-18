import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Main{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] a = s.nextLine().split(" ");
		int friendCnt = Integer.parseInt(a[0]);
		int connectCnt = Integer.parseInt(a[1]);
		ArrayList<Integer>[] input = new ArrayList[friendCnt];
		for(int xx = 0 ; xx<friendCnt ; xx++) {
			input[xx] = new ArrayList<Integer>();
		}
		for(int i=0 ; i<connectCnt ; i++) {
			String[] b = s.nextLine().split(" ");
			int formmer = Integer.parseInt(b[0]);
			int latter = Integer.parseInt(b[1]);
			input[formmer].add(latter);
			input[latter].add(formmer);
		}
		int cnt = Integer.parseInt(s.nextLine());
		boolean[] already = new boolean[friendCnt];
		for(int yy=0 ; yy<already.length ; yy++) {
			already[yy] = false;
		}
		boolean flg = false;
		for(int i=0 ; i<cnt ; i++) {
			flg = false;
			String[] c = s.nextLine().split(" ");
			int start = Integer.parseInt(c[0]);
			int end = Integer.parseInt(c[1]);
			LinkedList<Integer> queue = new LinkedList<Integer>();

			queue.offer(start);
			inner :while(! queue.isEmpty()) {
				int current = (Integer)queue.poll();
				if(already[current])
					continue;
				already[current] = true;
				if(current==end) {
					System.out.println("yes");
					flg = true;
					break inner;
				}
				for(int j=0 ; j<input[current].size() ; j++) {
					int next = (Integer)input[current].get(j);
					queue.offer(next);
				}
			}
			if(!flg)
				System.out.println("no");
		}
	}

}