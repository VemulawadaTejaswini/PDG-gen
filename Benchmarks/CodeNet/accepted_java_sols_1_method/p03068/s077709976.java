import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String str = sc.next();
        int index = sc.nextInt();
        System.out.println(str.replaceAll("[^" + String.valueOf(str.charAt(index-1))  +"]","*"));
    }
}