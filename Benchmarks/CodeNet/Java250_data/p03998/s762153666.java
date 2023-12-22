import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char turn = 'a';
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int aCur = 0;
        int bCur = 0;
        int cCur = 0;
        for (int i = 0 ; i < 300 ; i++) {

            if (turn == 'a') {
                if (aCur == a.length()) {
                    System.out.println("A");
                    return;
                }
                turn = a.charAt(aCur);
                aCur++;
            } else if (turn == 'b') {
                if (bCur == b.length()) {
                    System.out.println("B");
                    return;
                }
                turn = b.charAt(bCur);
                bCur++;
            } else {
                if (cCur == c.length()){
                    System.out.println("C");
                    return;
                }
                turn = c.charAt(cCur);
                cCur++;
            }
        }


    }

}