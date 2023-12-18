import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int c = 1;
        for(int i=1; i<n; i++) {
            if(s.charAt(i) != s.charAt(i-1)) {
                c++;
            }
        }
        System.out.println(c);
    }
}
