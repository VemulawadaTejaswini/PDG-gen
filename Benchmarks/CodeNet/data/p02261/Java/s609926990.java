import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] s1 = new String[N];
		String[] s2 = new String[N];
		
		int[] bs = new int[N];
		int[] ss = new int[N];
		for(int i = 0; i < N; i++) {
			String s = sc.next();
			s1[i] = s;
			s2[i] = s;
			int c = s.charAt(1) - '0';
			bs[i] = c;
			ss[i] = c;
		}
		BubbleSort(bs,s1, N);
		SelectionSort(ss,s2, N);

		print(s1);
		System.out.println("Stable");
		print(s2);
		System.out.println(match(s1, s2) ? "Stable" : "Not stable");
		
		sc.close();
	}
	
	void BubbleSort(int[] C, String[] s, int N) {
		for(int i = 0; i < N; i++) {
			for(int j = N-1; j > i; j--) {
				if(C[j] < C[j-1]) {
					int a = C[j];
					C[j] = C[j-1];
					C[j-1] = a;
					String tmp = s[j];
					s[j] = s[j-1];
					s[j-1] = tmp;
				}
			}
		}
	}
	
	void SelectionSort(int[] C, String[] s, int N) {
		for(int i = 0; i < N; i++) {
			int minj = i;
			for(int j = i; j < N; j++) {
				if(C[j] < C[minj]) {
					minj = j;
				}
			}
			int a = C[i];
			C[i] = C[minj];
			C[minj] = a;
			String tmp = s[i];
			s[i] = s[minj];
			s[minj] = tmp;
		}
	}
	
	 boolean match(String[] s1, String[] s2) {
	        for (int i = 0; i < s1.length; i++) {
	            if (!s1[i].equals(s2[i])) {
	                return false;
	            }
	        }
	        return true;
	    }
	
    void print(String[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.print((i == 0 ? "" : " ") + s[i]);
        }
        System.out.println();
    }

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
