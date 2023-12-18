import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int x = sc.nextInt();
		int y = sc.nextInt();
		ArrayList<Integer> xValues = new ArrayList<>();
		ArrayList<Integer> yValues = new ArrayList<>();
		boolean isX = true;
		boolean isFirst = true;
		int value = 0;
		for (char c : arr) {
		    if (c == 'T') {
		        if (isFirst) {
		            x -= value;
		            isX = false;
		            isFirst = false;
		        } else if (isX) {
	                xValues.add(value);
		            isX = false;
		        } else {
	                yValues.add(value);
		            isX = true;
		        }
		        value = 0;
		    } else {
		        value++;
		    }
		}
        if (isFirst) {
            x -= value;
        } else if (isX) {
            xValues.add(value);
        } else {
            yValues.add(value);
        }
        Collections.sort(xValues);
        Collections.sort(yValues);
        for (int i = xValues.size() - 1; i >= 0; i--) {
            if (x >= 0) {
                x -= xValues.get(i);
            } else {
                x += xValues.get(i);
            }
        }
        for (int i = yValues.size() - 1; i >= 0; i--) {
            if (y >= 0) {
                y -= yValues.get(i);
            } else {
                y += yValues.get(i);
            }
        }
        if (x == 0 && y == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
   }
}


