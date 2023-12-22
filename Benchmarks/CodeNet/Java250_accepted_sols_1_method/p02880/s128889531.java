import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        for(int i = 1; i < 10; i++){
            if(n%i==0 && n/i<10) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}