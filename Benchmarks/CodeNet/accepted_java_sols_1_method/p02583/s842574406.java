import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] len = new int[n];
        for(int i = 0; i < n; i++) {
            len[i] = sc.nextInt();
		}
		Arrays.sort(len);
		int[] t = new int[3];
		int count = 0;
        for(int a = 0; a < n; a++) {
            for(int b = 1; b < n; b++) {
                for(int c = 2; c < n; c++) {
                    if(len[a] == len[b] || len[b] == len[c] || len[c] == len[a])
					continue;
					if(a > b || b > c)
					continue;
                    t[0] = len[a];
                    t[1] = len[b];
                    t[2] = len[c];
					if(t[0] + t[1] > t[2]) {
					count++;
					}
                }
            }
		}
		int c = count;
		for(int j = 0; j < 3; j++) {
			
		}
		System.out.println(count);
    }
}