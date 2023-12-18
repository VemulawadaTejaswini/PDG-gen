import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> front = new ArrayList<>();
		ArrayList<Integer> rear = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    int type = sc.nextInt();
		    if (type == 0) {
		        if (sc.nextInt() == 0) {
		            front.add(sc.nextInt());
		        } else {
		            rear.add(sc.nextInt());
		        }
		    } else if (type == 1) {
		        int idx = sc.nextInt();
		        if (front.size() - 1 < idx) {
		            sb.append(rear.get(idx - front.size()));
		        } else {
		            sb.append(front.get(front.size() - idx - 1));
		        }
		        sb.append("\n");
		    } else {
		        if (sc.nextInt() == 1) {
		            if (rear.size() > 0) {
		                rear.remove(rear.size() - 1);
		            } else {
		                front.remove(0);
		            }
		        } else {
		            if (front.size() > 0) {
		                front.remove(front.size() - 1);
		            } else {
		                rear.remove(0);
		            }
		        }
		    }
		}
		System.out.print(sb);
	}
}

