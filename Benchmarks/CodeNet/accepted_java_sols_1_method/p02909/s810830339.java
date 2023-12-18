import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.equals("Sunny")) System.out.println("Cloudy");
        if (s.equals("Cloudy")) System.out.println("Rainy");
        if (s.equals("Rainy")) System.out.println("Sunny");
    }
}