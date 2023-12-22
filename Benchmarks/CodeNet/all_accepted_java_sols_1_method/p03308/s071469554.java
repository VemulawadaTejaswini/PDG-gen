import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	int max = 0;
      	int min = 0;

      	for (int i = 0; i < n; i++) {
          	int a = Integer.parseInt(sc.next());
        	if (i == 0) max = min = a;
          	if (max < a) max = a;
          	if (min > a) min = a;
        }
      	System.out.println(max - min);
    }
}