import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        sc.close();
        int count = 1;

        if (N == 1) {
        	System.out.println(1);
        	return;
        }
        for (int i = 0; i < N -1 ; i++) {
        	if (str.charAt(i) != str.charAt(i+1)) {
        		count++;
        	}
        }
    	System.out.println(count);
    }
}
