import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	private static final int MAX = 100_001;
	private static String[] P = new String[MAX];
	private static int[] Q = new int[MAX];
	private static int head, tail;
	private static int headQ, tailQ;

	public static void main(String[] args){

		initialize();
		initializeQ();
		int n = scan.nextInt();
		int q = scan.nextInt();
		String[] p = new String[n];
		for(int i = 0; i < n; i++){
			String s = scan.next();
			int m = scan.nextInt();
			enqueue(s);
			enqueueQ(m);
		}
		int total = 0;
		for(;;){
			String s = dequeue();
			int m = dequeueQ();
			if(m >q){
				total += q;
				m = m - q;
				enqueue(s);
				enqueueQ(m);
			}else{
				total += m;
				System.out.printf("%s ", s);
				System.out.printf("%d\n", total);
				if(isEmpty() && isEmptyQ())
					break;
			}
		}
	}

	private static void initializeQ(){
		headQ = tailQ = 0;
	}
	private static boolean isEmptyQ(){
		return headQ == tailQ;
	}
	private static boolean isFullQ(){
		return headQ == (tailQ + 1) % MAX;
	}
	public static void enqueueQ(int y){
		if(isFullQ())
			System.out.printf("%s\n", "???????????????????????§???");
		Q[tailQ] = y;
		if(tailQ + 1 == MAX)
			tailQ = 0;
		else
			tailQ++;
	}
	public static int dequeueQ(){
		if(isEmptyQ())
			System.out.printf("%s\n", "??¢????????????????????§???");
		int y = Q[headQ];
		if(headQ + 1 == MAX)
			headQ = 0;
		else
			headQ++;
		return y;
	}

	private static void initialize(){
		head = tail = 0;
	}
	private static boolean isEmpty(){
		return head == tail;
	}
	private static boolean isFull(){
		return head == (tail + 1) % MAX;
	}
	public static void enqueue(String x){
		if(isFull())
			System.out.printf("%s\n", "???????????????????????§???");
		P[tail] = x;
		if(tail + 1 == MAX)
			tail = 0;
		else
			tail++;
	}
	public static String dequeue(){
		if(isEmpty())
			System.out.printf("%s\n", "??¢????????????????????§???");
		String x = P[head];
		if(head + 1 == MAX)
			head = 0;
		else
			head++;
		return x;
	}
}