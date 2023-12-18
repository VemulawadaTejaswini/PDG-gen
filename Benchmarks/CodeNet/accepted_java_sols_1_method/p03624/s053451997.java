import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;
        for (char c = 'a' ; c <= 'z' ; c++) {
            boolean flg = true;
            for (int j = 0 ; j < n ; j++) {
                if (s[j] == c) flg = false;
            }
            if(flg) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("None");

    }

}