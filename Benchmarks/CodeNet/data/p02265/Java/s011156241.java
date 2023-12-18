import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = Integer.parseInt(sc.nextLine()); 
		DLL dll = new DLL();
		for (int i = 0; i < n; i++) {
			String cmd = sc.nextLine();
			if (cmd.regionMatches(0, "insert ", 0, 7)) {
				dll.insert(Integer.parseInt(cmd.substring(7)));
			} else if (cmd.regionMatches(0, "delete ", 0, 7)) {
				dll.delete(Integer.parseInt(cmd.substring(7)));
			} else if (cmd.equals("deleteFirst")) {
				dll.deleteFirst();
			} else if (cmd.equals("deleteLast")) {
				dll.deleteLast();
			}
			if (i % 1000000 == 0) {
				System.gc();
			}
		}
    	
		StringBuffer printData = new StringBuffer();
		for (DLLelement next = dll.first; next != null; next = next.next) {
			printData.append(next.data);
			printData.append(" ");
		}
		printData.delete(printData.length() - 1, printData.length());
		System.out.println(printData);

		sc.close();
	}
}

class DLL {
	DLLelement first;
	DLLelement last;
	DLLelement cache;
	
	DLL() {
		first = null;
		last = null;
		cache = null;
	}
	
	void insert(int x) {
		if (cache == null) {
			first = new DLLelement(x, first, null);
		} else {
			cache.data = x;
			cache.next = first;
			cache.prev = null;
			first = cache;
			cache = null;
		}
		if (last == null) {
			last = first;
		} else {
			first.next.prev = first;
		}
	}

	void delete(int x) {
		for (DLLelement next = first; next != null; next = next.next) {
			if (next.data == x) {
				if (next.prev == null) {
					first = next.next;
					if (first == null) {
						last = null;
					} else {
						first.prev = null;
					}
				} else if (next.next == null) {
					last = next.prev;
					if (last == null) {
						first = null;
					} else {
						last.next = null;
					}
				} else {
					next.prev.next = next.next;
					next.next.prev = next.prev;
				}
				cache = next;
				return;
			}
		}
//		System.out.println("not found");
	}

	void deleteFirst() {
		if (first == null) {
//			System.out.println("not found");
			return;
		} else {
			cache = first;
			first = first.next;
			if (first == null) {
				last = null;
				return;
			}
			first.prev = null;
		}
	}

	void deleteLast() {
		if (last == null) {
//			System.out.println("not found");
			return;
		} else {
			cache = last;
			last = last.prev;
			if (last == null) {
				first = null;
				return;
			}
			last.next = null;
		}
	}
}

class DLLelement {
	int data;
	DLLelement next;
	DLLelement prev;
	
	DLLelement(int x, DLLelement next, DLLelement prev) {
		data = x;
		this.next = next;
		this.prev = prev;
	}
}