import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int a = stdIn.nextInt();
        System.out.println(a + a * a + a * a * a);
    }
}