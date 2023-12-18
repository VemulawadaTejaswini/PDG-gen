import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        int b = 0;
        char[] s = sc.next().toCharArray();
        for (char c : s) {
            if(c == 'R') r++;
            else b++;
        }

        System.out.println(r > b ? "Yes" : "No");
        sc.close();
    }

}
