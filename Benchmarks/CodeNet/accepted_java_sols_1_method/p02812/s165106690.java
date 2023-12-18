import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        int count = 0;
        while (s.contains("ABC")) {
            s = s.substring(0, s.lastIndexOf("ABC"));
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
