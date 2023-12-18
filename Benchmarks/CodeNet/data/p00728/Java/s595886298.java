import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        while(true) {
            int referee = Integer.valueOf(sc.nextLine());

            if(referee == 0) {
                return;
            }

            Integer min = null;
            Integer max = null;
            int score = 0;
            for (int i = 0; i < referee; i++) {
                int tempScore = Integer.valueOf(sc.nextLine());
                score += tempScore;
                if(min == null || tempScore < min) {
                    min = tempScore;
                }

                if (max == null || tempScore > max) {
                    max = tempScore;
                }
            }

            System.out.println("" + (score - min - max) / (referee - 2));
        }


    }
}

