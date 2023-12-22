import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        int N, Y;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        Y = scanner.nextInt();
        int x, y, z = 0;

        boolean check = false;
        for (x = 0; x <= N; x++) {
            for (y = 0; y <= N - x; y++) {
                z = N - x - y;
                if (Y == x * 10000 + y * 5000 + z * 1000) {
                    System.out.println(x+" "+y+" "+z);
                    check = true;
                }
               if (check == true){
                   break;
               }
            }
            if(check == true) {
                break;
            }
        }
        if(check == false){
            System.out.println("-1 -1 -1");
        }

    }
}
