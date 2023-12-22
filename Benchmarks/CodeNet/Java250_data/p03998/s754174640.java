import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        int Ac = 0;
        int Bc = 0;
        int Cc = 0;
        char turns = 'a';
        while (true) {
            if (turns == 'a' && Ac >= A.length()) {
                System.out.println("A");
                return;
            } else if (turns == 'b' && Bc >= B.length()) {
                System.out.println("B");
                return;
            } else if (turns == 'c' && Cc >= C.length()) {
                System.out.println("C");
                return;
            }
            char turn = 0;
            if (turns == 'a') {
                turn = A.charAt(Ac);
                Ac++;
            } else if (turns == 'b') {
                turn = B.charAt(Bc);
                Bc++;
            } else {
                turn = C.charAt(Cc);
                Cc++;
            }
            switch(turn) {
            case 'a' :
                turns = 'a';
                break;
            case 'b' :
                turns = 'b';
                break;
            case 'c' :
                turns = 'c';
            }
        }
    }
    
}
