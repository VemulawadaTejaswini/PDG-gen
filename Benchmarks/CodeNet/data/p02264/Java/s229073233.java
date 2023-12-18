import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//標準入力受け取り////////////////////////////////
		String[] nandqueue = scan.nextLine().split(" ");
		int N = Integer.parseInt(nandqueue[0]); //プロセスの数受け取り
		int queue = Integer.parseInt(nandqueue[1]);	 //クオンタム受け取り
		
		String[] nameandtime = new String[2];
		String[] name = new String[N];
		String[] time = new String[N];
		
		for(int i = 0; i < N; i++) {
		nameandtime = scan.nextLine().split(" ");
		name[i] = nameandtime[0];
		time[i] = nameandtime[1];
		//System.out.println(time[i]); //確認用
		}
		//////////////////////////////////////////////////
		
		//queue作成//////////////////////////////
		//時間のdeque@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		Deque<String> deque1 = new ArrayDeque<>();
		for(int i = 0; i < N; i++) {
			deque1.add(time[i]);
		}
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//名前のdeque@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		Deque<String> deque2 = new ArrayDeque<>();
		for(int i = 0; i < N; i++) {
			deque2.add(name[i]);
		}
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		/////////////////////////////////////////
		
		//System.out.println(deque); //確認用
		
		//処理///////////////////////////////////////
		int count = 0; //キューのクリアカウント
		int queuetime = 0; //queueを加算した時間
		for(int i = 0; count < N; i++) {
			int x =Integer.parseInt(deque1.poll());
			String y = deque2.poll();
			x -= queue;
			if(x <= 0) {
				queuetime += (queue + x);
				x = 0;
				count++;
				System.out.println(y + " " + queuetime);
			} else {
				queuetime += queue;
				deque1.add(String.valueOf(x));
				deque2.add(y);
			}
			if(i < deque1.size()) {
				i = 0;
			}
		}
		//////////////////////////////////////////////
	}
}

