
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        boolean ans = false;
        String ans_dis = "Yes";
        List<Dice_d> list = new ArrayList<Dice_d>();
        int[] box = new int[6];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < 6; j++){
                box[j] = scan.nextInt();
            }
            Dice_d dice = new Dice_d(box[0], box[1], box[2], box[3], box[4], box[5]);
            list.add(dice);
            if(i != 0){
                for(int j = 0; j < i; j++){
                    Dice_d di = list.get(j);
                    ans = dice.fix_form(di.Top, di.N, di.E, di.W, di.S, di.Bottom);
                    if(ans == true){
                        ans_dis = "No";
                        break;
                    }
                }
            }


            if(ans_dis == "No"){
                break;
            }
        }
        System.out.println(ans_dis);

    }
}


class Dice_d {

    int Top;
    int N;
    int E;
    int S;
    int W;
    int Bottom;

    Dice_d(int a, int b, int c, int d, int e, int f) {
        Top = a;
        S = b;
        E = c;
        W = d;
        N = e;
        Bottom = f;
    }

    public boolean fix_form(int top, int n, int e, int w, int s, int bottom) {

        boolean ans = false;
        boolean a = false;
        boolean b = false;

        int i = 0;
        while (i < 2) {
            if (this.Top == top) {
                a = true;
                break;
            }
            rollN();
            if (this.Top == top) {
                a = true;
                break;
            }
            rollN();
            if (this.Top == top) {
                a = true;
                break;
            }
            rollN();
            if (this.Top == top) {
                a = true;
                break;
            }
            turnR();
            if (this.Top == top) {
                a = true;
                break;
            }
            turnR();
            if (this.Top == top) {
                a = true;
                break;
            }
            turnR();
            if (this.Top == top) {
                a = true;
                break;
            }
            i++;
        }
        if (a == true) {
            int f = 0;
            while (f < 1) {

                if (this.N == n) {
                    b = true;
                    break;
                }
                turnR();
                if (this.N == n) {
                    b = true;
                    break;
                }
                turnR();
                if (this.N == n) {
                    b = true;
                    break;
                }
                turnR();
                if (this.N == n) {
                    b = true;
                    break;
                }
                f++;
            }

        }
        /*
        System.out.println("引数表示　" + this.Top + " "+this.N +" "+ this.E + " "+ this.W + " "+ this.S +" " + this.Bottom);
        System.out.println("現在関数　" + top +" "+ n + " " + e + " " + w + " "+ s + " " + bottom);

*/
        if (a == true && b == true && this.E == e && this.W == w && this.S == s && this.Bottom == bottom) {
            ans = true;

        }
   //     System.out.println("ansの値　" + ans);
        return ans;


    }

    public void rollN() {
        int tmp = N;
        N = Top;
        Top = S;
        S = Bottom;
        Bottom = tmp;
    }

    public void turnR() {
        int tmp = E;
        E = N;
        N = W;
        W = S;
        S = tmp;
    }
}


