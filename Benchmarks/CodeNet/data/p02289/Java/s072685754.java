import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	StringBuilder output = new StringBuilder();
	
	PriorityQueue<Object> Que = new PriorityQueue<>(Collections.reverseOrder());
	
	String text;
	int number;
	
	public void solve() {
		while(true) {
			text = sc.next();
			if(text.equals("end")) {
				break;
			}else if(text.equals("insert")) {
				number = sc.nextInt();
				Que.add(number);
			}else {
				output.append( Que.poll()+"\n" );
			}
		}
		System.out.print(output);
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.solve();
	}
}

