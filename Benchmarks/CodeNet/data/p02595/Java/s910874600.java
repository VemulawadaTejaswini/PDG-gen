import java.util.*;

class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	int d = Integer.parseInt(sc.next());
      	int c = 0;
      
      	int[][] A = new int[n][2];
      	int x, y;
      	for (int i = 0; i < n; i++) {
          	x = Integer.parseInt(sc.next());
          	y = Integer.parseInt(sc.next());
          	if ((Math.pow(x, 2) + Math.pow(y, 2)) <= Math.pow(d, 2)) {c++;}
        }
      	System.out.println(c);
    }
}