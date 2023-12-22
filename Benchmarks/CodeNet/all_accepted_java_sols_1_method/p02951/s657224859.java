import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int res = A - B;
    	if (res >= C) {
    		res = 0;
    	} else {
    		res = C - res;
    	}

        System.out.println(res);
    }
}