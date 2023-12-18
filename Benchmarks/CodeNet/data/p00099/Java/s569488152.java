import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

//Surf Smelt Fishing Contest II
public class Main{

	int[] num;
	
	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), Q = sc.nextInt();
		num = new int[n+1];
		Queue<Integer> q = new PriorityQueue<Integer>(n, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return num[o1]==num[o2] ? o1-o2 : num[o2]-num[o1];
			}
		});
		for(int i=1;i<=n;i++)q.add(i);
		while(Q--!=0){
			int a = sc.nextInt(), v = sc.nextInt();
			q.remove(a);
			num[a]+=v;
			q.add(a);
			int res = q.peek();
			System.out.println(res+" "+num[res]);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}