import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String[] a = sc.nextLine().split(" ");
        int[] men = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            men[i] = Integer.parseInt(a[i]);
        }
        Dice dice1 = new Dice(men);

        a = sc.nextLine().split(" ");
        men = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            men[i] = Integer.parseInt(a[i]);
        }
        Dice dice2 = new Dice(men);


        // 1. top = default, bottom = default
        dice1.checkEqual(dice2);

        // 2. reverse 1.
        dice2.turnN(); dice2.turnN();
        dice1.checkEqual(dice2);
        dice2.turnN(); dice2.turnN();  // back to 1.
        
        // 3. top = front, bottom = back
        dice2.turnN(); 
        dice1.checkEqual(dice2);

        // 4. reverse 3.
        dice2.turnN(); dice2.turnN();
        dice1.checkEqual(dice2);
        dice2.turnN(); // back to 1.

        // 5. top = left, bottom = right
        dice2.turnE();
        dice1.checkEqual(dice2);

        // 6. reverse 5.
        dice2.turnE(); dice2.turnE();
        dice1.checkEqual(dice2);
        dice2.turnE(); // back to 1. 

        
        System.out.println("No");
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

    void checkEqual(Dice dice) {
        if ( this.equals(dice) ) {
            System.out.println("Yes");
            System.exit(0);
        } else {
            // nothing
        }
    }

    boolean equals(Dice dice) {
        if (this.top == dice.top) {
            if (this.bottom == dice.bottom) {
                for (int i=0; i<4; i++) {
                    if (this.right == dice.right 
                        && this.left == dice.left 
                        && this.back == dice.back 
                        && this.front == dice.front ) {
                        
                        return true;
                    } else {
                        this.turnR();
                    }
                }
            }
        }

        return false;
    }

    void turnN() {
        int tmp = this.top;
        this.top = this.front;
        this.front = this.bottom;
        this.bottom = this.back;
        this.back = tmp;
    }
    void turnS() {
        this.turnN();
        this.turnN();
        this.turnN();
    }
    void turnE() {
        int tmp = this.top;
        this.top = this.left;
        this.left = this.bottom;
        this.bottom = this.right;
        this.right = tmp;
    }
    void turnW() {
        this.turnE();
        this.turnE();
        this.turnE();
    }
    void turnR() {
        int tmp = this.front;
        this.front = this.right;
        this.right = this.back;
        this.back = this.left;
        this.left = tmp;
    }
    void turnL() {
        this.turnR();
        this.turnR();
        this.turnR();
    }
}

