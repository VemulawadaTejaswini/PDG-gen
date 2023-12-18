import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        String[] t = br.readLine().split(" ");
        int[] a = new int[6];
        int[] b = new int[6];

        for(int i = 0; i < s.length; i++){
            a[i] = Integer.parseInt(s[i]);
            b[i] = Integer.parseInt(t[i]);
        }

        Dice diceA = new Dice(a);
        Dice diceB = new Dice(b);

        diceB.setTop(diceA.TOP);
        diceB.setFront(diceA.FRONT);

        if(diceA.equals(diceB)) System.out.println("Yes");
        else                    System.out.println("No");
    }
}

class Dice{
    int TOP,BOTTOM,LEFT,RIGHT,FRONT,BACK;

    Dice(int[] a){
        this.TOP = a[0];
        this.FRONT = a[1];
        this.RIGHT = a[2];
        this.LEFT = a[3];
        this.BACK = a[4];
        this.BOTTOM = a[5];
    }

    boolean equals(Dice dice){
        return (this.TOP == dice.TOP &&
                this.FRONT == dice.FRONT &&
                this.RIGHT == dice.RIGHT &&
                this.LEFT == dice.LEFT &&
                this.BACK == dice.BACK &&
                this.BOTTOM == dice.BOTTOM);
    }

    void setTop(int top){
        if(this.FRONT == top)           this.turnN();
        else if(this.RIGHT == top)      this.turnW();
        else if(this.LEFT == top)       this.turnE();
        else if(this.BACK == top)       this.turnS();
        else if(this.BOTTOM == top)    {this.turnN(); this.turnN();}
    }

    void setFront(int front){
        if(this.RIGHT == front)         this.turnL();
        else if(this.LEFT == front)     this.turnR();
        else if(this.BACK == front)    {this.turnR(); this.turnR();}
    }

    void turnS(){
        int tmp = this.TOP;
        this.TOP = this.BACK;
        this.BACK = this.BOTTOM;
        this.BOTTOM = this.FRONT;
        this.FRONT = tmp;
    }

    void turnN(){
        int tmp = this.TOP;
        this.TOP = this.FRONT;
        this.FRONT = this.BOTTOM;
        this.BOTTOM = this.BACK;
        this.BACK = tmp;
    }

    void turnW(){
        int tmp = this.TOP;
        this.TOP = this.RIGHT;
        this.RIGHT = this.BOTTOM;
        this.BOTTOM = this.LEFT;
        this.LEFT = tmp;
    }

    void turnE(){
        int tmp = this.TOP;
        this.TOP = this.LEFT;
        this.LEFT = this.BOTTOM;
        this.BOTTOM = this.RIGHT;
        this.RIGHT = tmp;
    }

    void turnL(){
        int tmp = this.FRONT;
        this.FRONT = this.RIGHT;
        this.RIGHT = this.BACK;
        this.BACK = this.LEFT;
        this.LEFT = tmp;
    }

    void turnR(){
        int tmp = this.FRONT;
        this.FRONT = this.LEFT;
        this.LEFT = this.BACK;
        this.BACK = this.RIGHT;
        this.RIGHT = tmp;
    }

}