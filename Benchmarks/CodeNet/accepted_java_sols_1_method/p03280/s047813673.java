import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int area = a * b - a - b + 1;
        System.out.println(area);
    }
}