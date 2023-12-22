import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String[] str = cin.nextLine().split(" ");
			int rundex = Integer.parseInt(str[0]);
			int step = Integer.parseInt(str[1]);
			Queue<node> qu = new LinkedList<node>();
			int time =0;
			for (int i = 1; i <= rundex; i++) {
				str = cin.nextLine().split(" ");
				qu.add(new node(str[0], Integer.parseInt(str[1]),0));
			}
			while (!qu.isEmpty()) {
				node temp = qu.poll();
				if (temp.value <= step) {
					time+=temp.value;
					System.out.println(temp.point +" "+time);
				}
				else{
					time+=step;
					temp.value-=step;
					qu.add(temp);
				}
			}
		}
	}

	static class node {
		String point;
		int value;
		int usetime;
		public node(String point, int value,int usetime) {
			this.point = point;
			this.value = value;
			this.usetime=usetime;
		}
	}
}

