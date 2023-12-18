package CardGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        System.out.println(time);
        String p1, p2;
        int score1 = 0, score2 = 0;

        for(int i = 0; i < time; i++){
            p1 = sc.next();
            p2 = sc.next();

            System.out.println(p1 + " " + p2);

            if(p1.compareToIgnoreCase(p2) < 0)
                score2 += 3;
            if(p1.compareToIgnoreCase(p2) == 0){
                score1++;
                score2++;
            }
            else
                score1 += 3;
        }

        System.out.println(score1 + " " + score2);

        sc.close();
    }
}

