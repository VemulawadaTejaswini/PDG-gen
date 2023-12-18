import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node
{
	int key;
	Node prev, next;

	Node()
	{
		key = -1;
		prev = next = null;
	}
}

class DoublyLinkedList
{
	Node nil;
	int N;

	DoublyLinkedList()
	{
		nil = new Node();
		nil.next = nil;
		nil.prev = nil;
		N = 0;
	}

	//先頭に挿入
	void insertNode(Node t, int val)
	{
		Node x = new Node();
		x.key = val;
		x.next = t.next;
		t.next.prev = x;
		x.prev = t;
		t.next = x;
		N++;
	}

	void insertFirst(int val)
	{
		insertNode(nil, val);
	}

	void insertLast(int val)
	{
		insertNode(nil.prev, val);
	}

	void deleteNode(Node t)
	{
		if (t == nil)
		{
			return;
		}
		t.prev.next = t.next;
		t.next.prev = t.prev;
		N--;
	}

	void deleteFirst()
	{
		deleteNode(nil.next);
	}

	void deleteLast()
	{
		deleteNode(nil.prev);
	}

	Node searchKey(int key)
	{
		Node cur = nil.next;
		while (cur != nil && cur.key != key)
		{
			cur = cur.next;
		}
		return cur;
	}

	void deleteKey(int key)
	{
		deleteNode(searchKey(key));
	}

	void print()
	{
		for (Node cur = nil.next; cur != nil; cur = cur.next)
		{
			if (cur != nil.next)
			{
				System.out.print(" ");
			}
			System.out.print(cur.key);
		}
		System.out.println();
	}
}

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DoublyLinkedList L = new DoublyLinkedList();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; ++i)
		{
			String line = br.readLine();
			if (line.charAt(6) == ' ')
			{
				//****** x
				String[] com = line.split(" ");
				if (com[0].charAt(0) == 'i')
				{
					L.insertFirst(Integer.parseInt(com[1]));
				} else if (com[0].charAt(0) == 'd')
				{
					L.deleteKey(Integer.parseInt(com[1]));
				}
			} else
			{
				if (line.charAt(6) == 'F')
				{
					L.deleteFirst();
				} else if (line.charAt(6) == 'L')
				{
					L.deleteLast();
				}
			}
		}
		L.print();
	}
}

