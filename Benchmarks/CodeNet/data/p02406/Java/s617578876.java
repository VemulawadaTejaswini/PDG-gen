import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scanner.nextInt();
        int i = 1;
        do {
            int x = i;
            if (x % 3 == 0) {
                sb.append(" ");
                sb.append(i);
            } else {
                while (true) {
                    if (x % 10 == 3) {
                        sb.append(" ");
                        sb.append(i);
                        break;
                    }else {
                        x /= 10;
                        if (x == 0) {
                            break;
                        }
                    }
                }
            }


        }while( ++i <= n );
        
        System.out.println(sb.toString());

    }


}
