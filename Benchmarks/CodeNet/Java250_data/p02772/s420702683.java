import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();

        String[] vals = s.split(" ");
        String out = "APPROVED";
        for (int i = 0; i < vals.length; i++) {
            int x = Integer.parseInt(vals[i]);
            if (x % 2 == 0) {
                if (x % 3 != 0 && x % 5 != 0) {
                    out = "DENIED";
                    break;
                }
            }
        }
        System.out.println(out);
    }
}