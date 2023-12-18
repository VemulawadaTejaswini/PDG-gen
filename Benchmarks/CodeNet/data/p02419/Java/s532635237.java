import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String W = scan.nextLine();
        int count = 0;
        while (scan.hasNext()) {
        if (W.equals("END_OF_TEXT")) break;
                String s = scan.next();
                if (s.equalsIgnoreCase(W)) count++;
        }
        System.out.println(count);
    }
}