import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		Deque dq = new Deque();
		
		for (int i=0; i<n; i++) {
			int mode = sc.nextInt();
			if (mode == 0) {
				if (sc.nextInt() == 0) {
					dq.addFirst(sc.nextInt());
				}
				else {
					dq.addLast(sc.nextInt());
				}
			}
			else if (mode == 1) {
				System.out.println(dq.ar[dq.head+sc.nextInt()]);
			}
			else if (mode == 2) {
				if (sc.nextInt() == 0) {
					dq.removeFirst();
				}
				else {
					dq.removeLast();
				}
			}
		}
		
	}
}

class Deque {
	int ar[];
	int head = 500000, tail = 499999;
	Deque() {
		ar = new int[1000000];
	}
	
	void addFirst(int n) {head--; ar[head] = n;}
	void addLast(int n) {tail++; ar[tail] = n;}
	void removeFirst() {head++;}
	void removeLast() {tail--;}
}
