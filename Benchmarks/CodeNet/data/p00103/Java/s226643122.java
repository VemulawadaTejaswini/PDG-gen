import java.util.*;

class BaseballField {

    private boolean first;
    private boolean second;
    private boolean third;
    private int out;
    private int score;

    BaseballField () {
        this.first = false;    
        this.second = false;
        this.third = false;
        this.out = 0;
        this.score = 0;
    }

    void Homerun () {
        int run = 1;
        if (first) {
            run += 1;
            first = false;
        }
        if (second) {
            run += 1;
            second = false;
        }
        if (third) {
            run += 1;
            third = false;
        }
        this.score += run;
    }

    void Hit() {
        if (this.third) {
            this.score += 1;
            this.third = false;
        }
        if (this.second) {
            this.third = true;
            this.second = false;
        }
        if (this.first) {
            this.second = true;
        }
        this.first = true;
    }

    void Out () {
        this.out += 1;
        if (this.out == 3)  this.Change();
    }

    void Change() {
        System.out.println(this.score);
        this.first = false;
        this.second = false;
        this.third = false;
        this.out = 0;
        this.score = 0;
    }


}

class Main {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        BaseballField bf = new BaseballField();

        while (sc.hasNext()) {
            String line = sc.nextLine();

            if (line.equals("HIT"))     bf.Hit();
            if (line.equals("HOMERUN")) bf.Homerun();
            if (line.equals("OUT"))     bf.Out();
        }
    }
}