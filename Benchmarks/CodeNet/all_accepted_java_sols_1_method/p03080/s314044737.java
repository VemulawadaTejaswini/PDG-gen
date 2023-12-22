import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int r = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == 'R') r++;
        }

        System.out.println(r > n - r? "Yes" : "No");

        sc.close();
    }
}