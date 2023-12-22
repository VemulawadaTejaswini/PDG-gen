import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        sc.close();

        int score = 0;
        if (A<4) {
            score += (4-A)*100000;
        }
        if (B<4) {
            score += (4-B)*100000;
        }
        if (A==1 && B==1)
            score += 400000;
        
        System.out.println(score);
    }
}