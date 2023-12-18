import java.util.*;

class Main{
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		Deque dqa = new Deque(q);
		for(int i = 0; i < q; i++){
			int op = sc.nextInt();
			if(op == 0){
				int d = sc.nextInt();
				int x = sc.nextInt();
				if(d == 0) dqa.push_front(x);
				else dqa.push_back(x);
			}else if(op == 1){
				int p = sc.nextInt();
				System.out.println(dqa.get(p));
			}else{
				int d = sc.nextInt();
				if(d == 0) dqa.pop_front();
				else dqa.pop_back();
			}
		}
	}
}

class Deque{
	private int[] arr;
	private int front, rear;
	Deque(int n){
		arr = new int[n];
		front = 0;
		rear = 0;
	}
	public void push_front(int x){
		front = (front + arr.length - 1) % arr.length;
		arr[front] = x;
	}
	public void push_back(int x){
		arr[rear] = x;
		rear = (rear + 1) % arr.length;
	}
	public int pop_front(){
		int ret = arr[front];
		front = (front + 1) % arr.length;
		return ret;
	}
	public int pop_back(){
		int ret = arr[rear];
		rear = (rear + arr.length - 1) % arr.length;
		return ret;
	}
	int get(int p){
		return arr[(front + p + arr.length) % arr.length];
	}
}

