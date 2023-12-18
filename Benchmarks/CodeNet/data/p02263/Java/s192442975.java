import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private Deque<String> d;
	private String str;

	private void mainrun() {
		scan = new Scanner(System.in);

		d = new LinkedList<>();

		while(scan.hasNext()) {
			str = scan.next();

			switch(str) {
			case "+":
			case "-":
			case "*":
				d.push(Calculation(Long.parseLong(d.pop()),
								   Long.parseLong(d.pop()),
								   str).toString());
				break;

			default:
				d.push(str);
			}
		}

		System.out.println(d.pop());
		scan.close();
	}

	private Long Calculation(long x,long y,String c) {
		switch(c) {
		case "+":
			return y + x;
		case "-":
			return y - x;
		case "*":
			return y * x;
		}
		return (long) 0;
	}
}

