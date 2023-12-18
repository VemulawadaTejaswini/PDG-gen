import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String[] a = sc.nextLine().split(" ");
        int[] men = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            men[i] = Integer.parseInt(a[i]);
        }

        Dice dice = new Dice(men);

        int num = Integer.parseInt(sc.nextLine());
        for ( int i = 0; i < num; i++ ) {
            a = sc.nextLine().split(" ");
            int targetTop = Integer.parseInt(a[0]);
            int targetFront = Integer.parseInt(a[1]);

            if ( targetTop == dice.top ) {
                // nothing
            } else if ( targetTop == dice.front ) {
                dice.turnN();
            } else if ( targetTop == dice.back ) {
                dice.turnN(); dice.turnN(); dice.turnN();
            } else if ( targetTop == dice.left ) {
                dice.turnE();
            } else if ( targetTop == dice.right ) {
                dice.turnE(); dice.turnE(); dice.turnE();
            } else if ( targetTop == dice.bottom ) {
                dice.turnN(); dice.turnN();
            }

            if ( targetFront == dice.front ) {
                // nothing
            } else if ( targetFront == dice.right ) {
                dice.turnR();
            } else if ( targetFront == dice.left ) {
                dice.turnR(); dice.turnR(); dice.turnR();
            } else if ( targetFront == dice.back ) {
                dice.turnR(); dice.turnR();
            }

            System.out.println(dice.right);
 
        }

    }
}

class Dice {
    int top, front, right, left, back, bottom;

    public Dice(int[] men){
        this.top = men[0];
        this.front = men[1];
        this.right = men[2];
        this.left = men[3];
        this.back = men[4];
        this.bottom = men[5];
    }

    void turnN() {
        int tmp = this.top;
        this.top = this.front;
        this.front = this.bottom;
        this.bottom = this.back;
        this.back = tmp;
    }
    void turnE() {
        int tmp = this.top;
        this.top = this.left;
        this.left = this.bottom;
        this.bottom = this.right;
        this.right = tmp;
    }
    void turnR() {
        int tmp = this.front;
        this.front = this.right;
        this.right = this.back;
        this.back = this.left;
        this.left = tmp;
    }
}

