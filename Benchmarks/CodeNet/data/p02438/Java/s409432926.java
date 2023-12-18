import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		ArrayList<MyList> list = new ArrayList<>();

		int n = in.nextInt(), query = in.nextInt();
		for(int i = 0; i < n; i++) {
			MyList ls = new MyList();
			list.add(ls);
		}

		for(int i = 0; i < query; i++) {
			int odr = Integer.parseInt(in.next()), index = Integer.parseInt(in.next());

			switch(odr) {
				case 0:
					list.get(index).add(Integer.parseInt(in.next()));
					break;

				case 1:
					list.get(index).dump(out);
					break;

				case 2:
					list.get(Integer.parseInt(in.next())).splice(list.get(index));
					break;
			}
		}
		out.flush();
		in.close();
	}


	static class ListNode{
		int value;
		ListNode next;

		ListNode(int v){
			this.value = v;
		}
	}

	static class MyList{
		ListNode END, TAIL;
		int size;

		MyList(){
			END  = new ListNode(0);
			TAIL = END;
			size = 0;
		}

		void add(int x) {
			ListNode NEW = new ListNode(x);
			NEW.next = END;
			TAIL.next = NEW;

			TAIL = NEW;
			size++;
		}

		void clear() {
			END.next = END;
			TAIL = END;
			size = 0;
		}

		void dump(PrintWriter out) {
			ListNode NOW = END;

			for(int i = 0; i < size-1; i++) {
				NOW = NOW.next;
				out.print(NOW.value + " ");
			}
			if(TAIL != END) {
				NOW = NOW.next;
				out.println(NOW.value);
			}
			else out.println();
		}

		void splice(MyList list) {
			TAIL.next = list.END.next;
			list.TAIL.next = this.END;
			this.TAIL = list.TAIL;

			size += list.size;

			list.clear();
		}
	}
}

