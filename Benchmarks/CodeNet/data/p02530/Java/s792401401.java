import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int[] score = new int[2];
        String[] card = new String[2];
        int judge = 0;
  
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            card[0] = scanner.next();
            card[1] = scanner.next();
            
            judge = card[0].compareTo(card[1]);
            if (judge > 0) {
                score[0] += 3;
            } else if (judge == 0) {
                score[0] += 1;
                score[1] += 1;
            } else {
                score[1] += 3;
            }
        }
        System.out.println(score[0] + " " + score[1]);
    }
}