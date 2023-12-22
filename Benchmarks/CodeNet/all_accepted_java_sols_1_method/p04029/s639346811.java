import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int children = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= children; i++) {
            result += i;
        }
        
        System.out.println(result);
    }
}