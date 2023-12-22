import java.io.IOException;
import java.util.Scanner;
public class Main {

	private static String q[]; // pueue
	private static int num; // カードの枚数
	private static int times; // シャッフルの回数
	private static String result; // 結果
	private static int front;
	private static int rear;

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		while(true) {
			String s = sc.next();
			if(s.equals("-")) {
				break;
			}

			String[] array = s.split("");
			num = array.length;
			q = new String[num+1];
			result = "";
			front = 0;
			rear = num;

			for(int i=0;i<num;i++) {
				q[i] = array[i];
			}
			times = sc.nextInt();
			for(int i=0;i<times;i++) {
				int tmp = sc.nextInt();
				for(int j=0;j<tmp;j++) {
					enqueue(dequeue());
				}
			}

			for(int i=front;i!=rear;i=next(i)) {
				result += q[i];
			}
			System.out.println(result);
		}

		sc.close();
	}

	public static int next(int a) {
		return (a + 1) % (num+1);
	}

	public static void enqueue(String x) {
		q[rear] = x;
		rear = next(rear);
	}

	public static String dequeue() {
		String x = q[front];
		q[front] = null;
		front = next(front);
		return x;
	}
}
