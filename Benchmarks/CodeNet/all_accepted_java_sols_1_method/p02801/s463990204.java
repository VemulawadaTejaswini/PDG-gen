import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int value = n.charAt(0);
        String nextValue = String.valueOf((char)(value + 1));
        System.out.println(nextValue);
    }
}