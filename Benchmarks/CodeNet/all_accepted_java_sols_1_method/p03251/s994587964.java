
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = sc.nextInt();

        int x = sc.nextInt();

        int y = sc.nextInt();

        int max_x = -100;

        int min_y = 100;

        for(int i = 0;i < n;i++){

            max_x = Math.max(max_x,sc.nextInt());

        }

        for(int i = 0;i < m;i++){

            min_y = Math.min(min_y,sc.nextInt());

        }

        for(int i = x+1 ;i <= y;i++){

            if(max_x < i&&i <= min_y){
                System.out.println("No War");
                return;
            }

        }

        System.out.println("War");

    }
}