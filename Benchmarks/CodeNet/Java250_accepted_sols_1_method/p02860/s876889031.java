import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        if(n % 2 != 0){
            System.out.println("No");
        } else {
            String x = s.substring(0, (n /2));
            String y = s.substring((n /2), n);
            if(x.equals(y)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }


        scanner.close();

    }
}