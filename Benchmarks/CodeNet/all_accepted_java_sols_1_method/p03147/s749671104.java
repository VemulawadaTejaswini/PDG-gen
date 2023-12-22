import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int[] arrs = new int[n + 1];
      	for (int i = 1; i <= n; i++) {
        	arrs[i] = sc.nextInt();
        }
		int result = 0;
      	for (int i = 1; i <= n; i++) {
        	result += Math.max(arrs[i] - arrs[i - 1], 0);
        }
      	System.out.println(result);
    }
}