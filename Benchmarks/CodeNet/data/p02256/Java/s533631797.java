import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean bl = true;
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z;
        while(true) {
            z = x % y;
            x = y;
            y = z;
            if( y == 0){
                break;
            }
        }
        System.out.printf("%d%n", x);
    }
}
