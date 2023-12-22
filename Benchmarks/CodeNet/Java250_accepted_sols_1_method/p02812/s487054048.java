import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        while (s.contains("ABC")) {
            s = s.replaceFirst("ABC", "");
            count++;
        }
        System.out.println(count);
    }

}
