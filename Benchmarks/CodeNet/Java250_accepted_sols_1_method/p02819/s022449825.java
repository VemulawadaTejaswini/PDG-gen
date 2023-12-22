import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = 1_000_000;
        int[] arr = new int[size+1];

        for(int i = 1; i <= n; i++)
        	arr[i] = i;

        for(int i = 2; i <= n; i++) {
        	if(arr[i] == -1) continue;
        	for(int j = i*2; j <= size; j=j+i) {
        		arr[j] = -1;
        	}
        }
        for(int i = n; i <= size; i++) {
        	if(arr[i] != -1) {
        		System.out.println(i);
        		return;
        	}
        }
    }
}
