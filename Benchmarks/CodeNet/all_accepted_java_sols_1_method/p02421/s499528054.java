import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i, n;
        n = sc.nextInt();
        int L = 0, R = 0;
        for( i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();

            if(a.compareTo(b) == 0) {
                L++;
                R++;
            }
            else if(a.compareTo(b) < 0) {
                L += 3;
            }
            else {
                R += 3;
            }
        }
        System.out.println(R + " " + L);
        sc.close();
    }
}

