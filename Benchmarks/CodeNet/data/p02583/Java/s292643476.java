import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println(0);
            return;
        }
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (list[j] != list[i]) {
                    for (int k = j + 1; k < n; k++) {
                        if (list[k] != list[i] 
                            && list[k] != list[j]
                            && list[i] + list[j] > list[k]
                            && list[i] + list[k] > list[j]
                            && list[j] + list[k] > list[i]) {
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
	}
}