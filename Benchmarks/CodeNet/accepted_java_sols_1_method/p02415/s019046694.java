import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        for (int i=0; i<s.length; ++i) {
            String x = String.valueOf(s[i]);
            if (x.equals(x.toUpperCase())) {
                System.out.print(x.toLowerCase());
            } else if (x.equals(x.toLowerCase())) {
                System.out.print(x.toUpperCase());
            } else {
                System.out.print(x);
            }
        }
        System.out.println("");
        sc.close();
    }
}

