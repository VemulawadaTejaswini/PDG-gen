import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                cnt++;
            }
        }
        System.out.println(cnt > 0? "Bad":"Good");
    }
}
