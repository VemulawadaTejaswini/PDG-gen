import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()) {
            Integer sum = s.nextInt() + s.nextInt();
            String str = sum.toString();
            System.out.println(str.length());
        }
    }
}