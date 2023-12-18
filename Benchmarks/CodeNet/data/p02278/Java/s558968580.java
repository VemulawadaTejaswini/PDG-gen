import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		int[] w = new int[n];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
    	for (int i = 0; i < n; i++) {
    		w[i] = sc.nextInt();
    		hm.put(w[i], i);
    	}
    	int[] sort = w.clone();
    	Arrays.sort(sort);
    	
    	int ret = 0;
    	int swapi = 0;
    	int swapj = 0;
    	for (int i = 0; i < n; i++) {
    		int min = sort[i];
    		int mini = hm.get(min);
    		while (mini != i) {
    			swapi = mini;
    			swapj = hm.get(sort[mini]);
    			int tmp = w[swapj];
    			w[swapj] = w[swapi];
    			w[swapi] = tmp;
    			hm.put(w[swapj], swapj);
    			hm.put(w[swapi], swapi);
    			
    			ret += w[swapj] + w[swapi];
    			mini = hm.get(min);
    		}
    	}

		System.out.println(ret);
    	
        sc.close();
	}
}