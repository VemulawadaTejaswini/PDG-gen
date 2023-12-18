
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] height = new int[N];
        for(int i = 0; i < N; i++) {
        	height[i] = sc.nextInt();
        }
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int j = 0; j < M; j++) {
        	int num1 = sc.nextInt();
        	int num2 = sc.nextInt();
        	if(height[num1 - 1] >height[num2 - 1]) {
        		hs.add(num2);
        	}
        	else if(height[num1 - 1] < height[num2 - 1]) {
        		hs.add(num1);
        	}
        	else {
        		hs.add(num1);
        		hs.add(num2);
        	}
        }
        System.out.println(N - hs.size());

    }

}
