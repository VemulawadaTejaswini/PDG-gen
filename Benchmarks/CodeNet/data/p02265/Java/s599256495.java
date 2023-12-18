import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Main {

//	public static void main(String[] args) {
	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
//		Scanner sc = new Scanner(System.in);
//		int n= sc.nextInt();
//		sc.nextLine();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int n = Integer.parseInt( br.readLine() );

		DoublyLL ll = new DoublyLL();

		for (int i=0; i < n; i++) {
//			String command = sc.nextLine();
			String command = br.readLine();

			switch (command) {
			case "deleteFirst":
				ll.deleteFirst();
				continue;
			case "deleteLast":
				ll.deleteLast();
				continue;
			}

//			int x = Integer.parseInt(command.split(" ")[1]);

			switch (command.split(" ")[0]) {
			case "insert":
				ll.insert(Integer.parseInt(command.split(" ")[1]));
				continue;
			case "delete":
				ll.delete(Integer.parseInt(command.split(" ")[1]));
				continue;
			}
		}

		StringBuilder sb = new StringBuilder();

		DoublyLL.Element e = ll.fal.next;
		if ( e != ll.fal)
			sb.append(e.key);
		e = e.next;
		while (e != ll.fal) {
			sb.append(" " + e.key);
			e = e.next;
		}
		System.out.println(sb);
	}

}

class DoublyLL {

	class Element {
		Element previous;

		int key;

		Element next;

		Element(Element previous, int key, Element next) {
			this.key = key;
			this.next = next;
			this.previous = previous;
		}
	}

	// dammy first and last element
	// fal <-> element_1 <-> element_2 <-> ... <-> element_n <-> fal
	Element fal;

	Element newfirst;
	Element temp;

	// constructor
	DoublyLL() {
		fal = new Element(null, 0, null);
		fal.previous = fal;
		fal.next = fal;
	}

	// insert x
	void insert(int x) {
//		Element newfirst = new Element(fal, x, fal.next);
		newfirst = new Element(fal, x, fal.next);
		fal.next.previous = newfirst;
		fal.next = newfirst;
	}

	// delete x
	void delete(int x) {
//		Element temp = fal.next;
		temp = fal.next;

		while (temp != fal) {
			if (temp.key == x) {
				temp.previous.next = temp.next;
				temp.next.previous = temp.previous;
				break;
			}
			temp = temp.next;
		}

	}

	void deleteFirst() {
		// temp : first element of this list
		Element temp = fal.next;
		temp = fal.next;
		fal.next = temp.next;
		temp.next.previous = fal;
	}

	void deleteLast() {
		// temp : last element of this list
//		Element temp = fal.previous;
		temp = fal.previous;
		temp.previous.next = fal;
		fal.previous = temp.previous;
	}
}