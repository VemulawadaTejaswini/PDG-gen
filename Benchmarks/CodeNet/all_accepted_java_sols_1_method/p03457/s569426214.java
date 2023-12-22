import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int prevT = 0;
        int prevX = 0;
        int prevY = 0;

        for(int i = 0; i < t; i++) {
            int curT = sc.nextInt();
            int curX = sc.nextInt();
            int curY = sc.nextInt();

            int dist = Math.abs(curX - prevX) + Math.abs(curY - prevY);
            int diffT = curT - prevT;
            if(diffT < dist || dist % 2 != diffT % 2) {
                System.out.println("No");
                return;
            }

            prevT = curT;
            prevX = curX;
            prevY = curY;
        }


        
        System.out.println("Yes");
    }
}
