import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int xmax = -101;
        for(int i = 0;i < n;i++){
            int temp = sc.nextInt();
            xmax = Math.max(xmax, temp);
        }

        int ymin = 101;
        for(int i = 0;i < m;i++){
            int temp = sc.nextInt();
            ymin = Math.min(ymin, temp);
        }

        if(ymin <= xmax){
            System.out.println("War");
            System.exit(0);
        }

        if(ymin <= x || xmax >= y){
            System.out.println("War");
            System.exit(0);
        }

        System.out.println("No War");
    }
}
