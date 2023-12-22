import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		
		ArrayList<Integer> A = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			A.add(Integer.parseInt(sc.next()));
		}
		
		for (int h = 0; h < n; h++) {
            if (h == n - 1) {
                System.out.println(A.get(h));
            } else {
                System.out.print(A.get(h) + " ");
            }
        }
		
		for (int i=1; i<A.size();i++) {
			int v = A.get(i);
			int j = i-1;
			
			while(j>=0 && A.get(j)>v) {
				A.set(j+1, A.get(j));
				j--;
			}
			A.set(j+1, v);
			for (int h = 0; h < n; h++) {
	            if (h == n - 1) {
	                System.out.println(A.get(h));
	            } else {
	                System.out.print(A.get(h) + " ");
	            }
	        }
		}
    }
}

