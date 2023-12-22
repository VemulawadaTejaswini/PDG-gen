import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();
        String[] t = scan.nextLine().split("");
        String c = "";
        scan.close();
        int l = n * 2;
        for (int i = 0; i < n; i++) {
            c += t[i];
            if (s.endsWith(c)) {
                l = n * 2;
                l -= (i+1);
            }

        }
        System.out.println(l);
    }
}
