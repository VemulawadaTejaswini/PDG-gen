import java.util.*;
import java.io.*;


public class Main {

	static void add(ArrayList<Integer> a, int i, int x) {
		a.set(i-1, a.get(i-1) + x);
	}

	static int getSum(ArrayList<Integer> a, int s, int t ) {
		int sum = 0;

		for (int i = s-1; i <= t-1; i++) {
			sum += a.get(i);
		}
		return sum;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] line1 = br.readLine().split(" ");
		    int n = Integer.parseInt(line1[0]);
		    int q = Integer.parseInt(line1[1]);

		    ArrayList<Integer> a = new ArrayList<>();
		    for (int i = 0; i < n; i++) {
		    	a.add(0);
		    }

		    ArrayList<Integer> com = new ArrayList<>();
		    ArrayList<Integer> x = new ArrayList<>();
		    ArrayList<Integer> y = new ArrayList<>();

		    for (int i = 0; i < q; i++) {
		    	String[] line = br.readLine().split(" ");
		    	com.add(Integer.parseInt(line[0]));
		    	x.add(Integer.parseInt(line[1]));
		    	y.add(Integer.parseInt(line[2]));
		    }

            for (int i = 0; i < q; i++) {
			    if (com.get(i) == 0) {
			    	add(a, x.get(i), y.get(i));
			    } else if (com.get(i) == 1) {
			    	System.out.println(getSum(a, x.get(i), y.get(i)));
			    }

		    }
        } catch (IOException e) {
            System.out.println(e);
        }
	}
}