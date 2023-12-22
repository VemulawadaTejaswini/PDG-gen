import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 1;
        int x = 0;
        int[] ary = new int[a];
        for (int i = 0; i < a; i++) {
        	ary[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
        	x += ary[i];
        	if (x <= b) {
            	ans++;
        	}
        }
        System.out.println(ans);
    }
}