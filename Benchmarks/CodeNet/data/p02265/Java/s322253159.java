import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
	int key;
	Node prev;
	Node next;

	Node() {
		key = -1;
		prev = null;
		next = null;
	}
}

class Linked {
	Node nil;
	int N;

	Linked() {
		nil = new Node();
		nil.next = nil;
		nil.prev = nil;
		N = 0;
	}

	void InsertFirst(int val) { //最初に挿入
		Node X = new Node();
		X.key = val;
		X.next = nil.next;
		nil.next.prev = X;
		nil.next = X;
		X.prev = nil;
	}

	Node Search(int val) {
		Node ima = nil.next;
		while ((ima != nil) && (ima.key != val)) {
			ima = ima.next;
		}
		return ima;
	}

	void DeleteNode(Node X) {
		if (X == nil) {
			return;
		}
		X.prev.next = X.next;
		X.next.prev = X.prev;
	}

	void DeleteFirst() {
		DeleteNode(nil.next);
	}

	void DeleteLast() {
		DeleteNode(nil.prev);
	}

	void SearchDelete(int val) {
		DeleteNode(Search(val));
	}
	void print() {
		for(Node ima = nil.next;ima != nil; ima = ima.next) {
				if(ima != nil.next) {
					System.out.print(" ");
				}
				System.out.print(ima.key);
		}
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		Linked S = new Linked();
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		int n = Integer.parseInt(a);
		for (int i = 0; i < n; i++) {
			a = br.readLine();
			if(a.charAt(6)== ' ') {
				if(a.charAt(0) == 'i') {
					S.InsertFirst(a.charAt(7)-'0');
				}
				else if(a.charAt(0) == 'd') {
					S.SearchDelete(a.charAt(7)-'0');
				}
			}

			else if (a.charAt(6) == 'L') {
				S.DeleteLast();
			}else if(a.charAt(6) == 'F') {
				S.DeleteFirst();
			}
		}

		S.print();

	}

}

