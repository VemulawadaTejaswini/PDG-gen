import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

//A Way to Invite Friends
public class Main{

	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer>[] l = new List[100002];
		for(int i=0;i<100002;i++)l[i]=new ArrayList<Integer>();
		while(n--!=0)l[sc.nextInt()].add(sc.nextInt());
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(2, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		int r = 1, f = 1<<29;
		for(int i:l[2])q.add(i);
		while(r<=f&&!q.isEmpty()){
			int p = q.poll();
			f = Math.min(f, p);
			if(f<r+1)break;
			r++;
			for(int i:l[r+1])q.add(i);
		}
		System.out.println(r-1);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}