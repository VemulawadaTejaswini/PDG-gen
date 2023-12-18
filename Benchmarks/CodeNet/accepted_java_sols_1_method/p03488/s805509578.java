import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] commands = sc.next().toCharArray();
		int x = sc.nextInt();
		int y = sc.nextInt();
		HashSet<Integer> xIdxes = new HashSet<>();
		HashSet<Integer> yIdxes = new HashSet<>();
		xIdxes.add(0);
		yIdxes.add(0);
		boolean isFirst = true;
		boolean isHorisontal = true;
		int count = 0;
		for (char c : commands) {
		    if (c == 'F') {
		        count++;
		    } else {
		        if (isFirst) {
		            x -= count;
		            isFirst = false;
		        } else {
		            HashSet<Integer> next = new HashSet<>();
		            if (isHorisontal) {
		                for (int a : xIdxes) {
		                    next.add(a + count);
		                    next.add(a - count);
		                }
		                xIdxes = next;
		            } else {
		                for (int a : yIdxes) {
		                    next.add(a + count);
		                    next.add(a - count);
		                }
		                yIdxes = next;
		            }
		        }
		        count = 0;
		        isHorisontal ^= true;
		    }
		}
        if (isFirst) {
            x -= count;
        } else {
            HashSet<Integer> next = new HashSet<>();
            if (isHorisontal) {
                for (int a : xIdxes) {
                    next.add(a + count);
                    next.add(a - count);
                }
                xIdxes = next;
            } else {
                for (int a : yIdxes) {
                    next.add(a + count);
                    next.add(a - count);
                }
                yIdxes = next;
            }
        }
        if (xIdxes.contains(x) && yIdxes.contains(y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

