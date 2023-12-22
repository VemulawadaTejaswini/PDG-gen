import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int numLines = scn.nextInt();

        int time = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < numLines; i++) {
            int timeStamp = scn.nextInt();
            int newX = scn.nextInt();
            int newY = scn.nextInt();

            int distance = Math.abs(x - newX) + Math.abs(y - newY);
            if ( (distance <= timeStamp - time) && (timeStamp - time)%2 == distance%2) {
                time = timeStamp;
                x = newX;
                y = newY;
            } else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}

