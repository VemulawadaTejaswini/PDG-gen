import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 0;
        String w = sc.next();
        String t = "";
        while (!(t = sc.next()).equals("END_OF_TEXT")) {
            if (w.equals(t.toLowerCase())) {
                counter += 1;
            }
        }

        System.out.println(counter);

        sc.close();
    }
}
