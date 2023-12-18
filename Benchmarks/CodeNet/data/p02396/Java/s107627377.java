import java.util.Scanner;

public class Main{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = 0;
        while(a != 0){
            n++;
            System.out.println("Case " + n + ": "+a);
            a = scanner.nextInt();
        }
    }
}

