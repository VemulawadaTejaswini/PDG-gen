import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long[][] comb = new long[100][100];
		for (int i = 0; i < 100; i++) {
		    for (int j = 0; j <= i; j++) {
		        if (j == 0 || j == i) {
		            comb[i][j] = 1;
		        } else {
		            comb[i][j] = comb[i - 1][j - 1] + comb[i - 1][j]; 
		        }
		    }
		}
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 1; i <= n; i++) {
		    int x = i;
		    for (int j = 2; j <= Math.sqrt(x); j++) {
		        while (x % j == 0) {
		            if (map.containsKey(j)) {
		                map.put(j, map.get(j) + 1);
		            } else {
		                map.put(j, 1);
		            }
		            x /= j;
		        }
		    }
		    if (x != 1) {
		        if (map.containsKey(x)) {
		            map.put(x, map.get(x) + 1);
		        } else {
		            map.put(x, 1);
		        }
		    }
		}
		int over75 = 0;
		int over25 = 0;
		int over15 = 0;
		int over5 = 0;
		int over3 = 0;
		for (int x : map.values()) {
		    int y = x + 1;
		    if (y >= 75) {
		        over75++;
		        over25++;
		        over15++;
		        over5++;
		        over3++;
		    } else if (y >= 25) {
		        over25++;
		        over15++;
		        over5++;
		        over3++;
		    } else if (y >= 15) {
		        over15++;
		        over5++;
		        over3++;
		    } else if (y >= 5) {
		        over5++;
		        over3++;
		    } else if (y >= 3) {
		        over3++;
		    }
		}
		long total = 0;
		total += comb[over75][1];
		total += comb[over25][1] * comb[Math.max(over3 - 1, 0)][1];
		total += comb[over15][1] * comb[Math.max(over5 - 1, 0)][1];
		total += comb[over5][2] * comb[Math.max(over3 - 2, 0)][1];
		System.out.println(total);
    }
}

