import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		String [] A = new String[N];
    		for (int i=0; i<N; i++) {
    			A[i] = sc.next();
    		}

    		HashMap<String, Integer> map = new HashMap<>();

    		for (int i=0; i<N; i++) {
    			if (map.containsKey(A[i])) {
    				int count = map.get(A[i]);
    				count++;
    				map.put(A[i], count);
    			} else {
    				map.put(A[i], 1);
    			}
    		}

    		int maxCount = 0;
    		ArrayList<String> list = new ArrayList<>();
    		Iterator<String> it = map.keySet().iterator();
    		while (it.hasNext()) {
    			String s = it.next();
    			int count = map.get(s);
    			if (maxCount < count) {
    				list.clear();
    				list.add(s);
    				maxCount = count;
    			} else if (maxCount == count) {
    				list.add(s);
    			}
    		}

    		Collections.sort(list);
    		for(String s: list) {
    			System.out.println(s);
    		}

    	} finally {
    		sc.close();
    	}
    }
}
