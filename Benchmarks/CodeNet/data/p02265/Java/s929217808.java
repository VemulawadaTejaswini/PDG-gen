import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static Node nil = new Node();

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int n = Integer.parseInt(br.readLine());
			Main main = new Main();
			for (int i = 0; i < n; i++) {
				String[] tmpStr = br.readLine().split(" ");

				switch (tmpStr[0]) {
				case "insert":
					main.insert(Integer.parseInt(tmpStr[1]));
					break;

				case "delete":
					main.deleteKey(Integer.parseInt(tmpStr[1]));
					break;

				case "deleteFirst":
					main.deleteFirst();
					break;

				case "deleteLast":
					main.deleteLast();
					break;

				}
			}

			// 連結リストの中身の値を先頭からすべて表示
			Node cur = nil.next;
			while (cur != nil) {
				if (cur == nil.prev) {// 末尾のノードの場合
					System.out.println(cur.key);
				} else {
					System.out.print(cur.key + " ");
				}
				cur = cur.next;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	void insert(int key) {
		Node x = new Node(key);
		x.next = nil.next;
		nil.next.prev = x;
		nil.next = x;
		x.prev = nil;

	}

	// 特定のキーを持つノードを検索して返す
	Node listSearch(int key) {
		Node cur = nil.next;
		while (cur != nil && cur.key != key) {
			cur = cur.next;
		}
		return cur.key == key ? cur : null;
	}

	// キーを削除する処理
	void deleteNode(Node t) {
		if (t == nil)
			return;
		t.prev.next = t.next;
		t.next.prev = t.prev;
		t = null;
	}

	// 先頭のノードを削除する
	void deleteFirst() {
		deleteNode(nil.next);
		// deleteNodeの方でnilが渡された場合の対処済み
		// if (nil.next != nil) {
		// deleteNode(nil.next);
		// }
	}

	// 末尾のノードを削除する
	void deleteLast() {
		deleteNode(nil.prev);
	}

	// 特定のキーを持つノードを削除する
	void deleteKey(int key) {
		deleteNode(listSearch(key));

	}

}

class Node {
	int key;
	Node prev, next;

	// 番兵(nil)用
	public Node() {
		prev = this;
		next = this;
	}

	public Node(int key) {
		this.key = key;

	}

}
