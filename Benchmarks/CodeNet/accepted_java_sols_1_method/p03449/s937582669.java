import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] over = new int[N];
    	for (int i = 0; i < N; i++) {
    		over[i] = sc.nextInt();
    	}
    	int[] under = new int[N];
    	for (int i = 0; i < N; i++) {
    		under[i] = sc.nextInt();
    	}
    	int max = 0;
    	for (int i = 0; i < N; i++) {
    		int candy = 0;
    		for (int j = 0; j < N; j++) {
    			if (j < i) {
    				candy += over[j];
    			} else if (j == i) {
    				candy += over[j];
    				candy += under[j];
    			} else {
    				candy += under[j];
    			}
    		}
    		if (max < candy) {
    			max = candy;
    		}
    	}
    	System.out.println(max);
    }
}