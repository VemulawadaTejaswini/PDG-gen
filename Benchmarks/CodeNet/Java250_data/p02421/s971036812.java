import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] score = new int[2];
        while (n-- > 0) {
            String a = input.next();
            String b = input.next();
            int cmp = a.compareTo(b);
            if (0 < cmp) score[0] += 3;
            else if (cmp < 0) score[1] += 3;
            else {score[0]++; score[1]++;}
        }
        System.out.println(String.format("%d %d", score[0], score[1]));
    }
}