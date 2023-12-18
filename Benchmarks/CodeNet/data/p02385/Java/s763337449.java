
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] d1 = new int[6];
        for(int x = 0; x < 6; x++){
            d1[x] = scan.nextInt();
        }
        Dice_c dice1 = new Dice_c(d1[0],d1[1],d1[2],d1[3],d1[4],d1[5]);
        for(int y = 0; y < 6; y++){
            d1[y] = scan.nextInt();
        }
        Dice_c dice2 = new Dice_c(d1[0],d1[1],d1[2],d1[3],d1[4],d1[5]);
        dice1.fix_form(dice2.Top,dice2.N,dice2.E);

    }
}

class Dice_c {

    int Top;
    int N;
    int E;
    int S;
    int W;
    int Bottom;

    Dice_c(int a, int b, int c, int d, int e, int f){
        Top = a;
        S = b;
        E = c;
        W = d;
        N = e;
        Bottom = f;
    }

    public void fix_form (int top, int n, int e) {

        String ans = "No";
        boolean a = false;
        boolean b = false;

        int i = 0;
        while(i < 2){
            if(this.Top == top){
                a = true;
                break;
            }
            rollN();
            if(this.Top == top){
                a = true;
                break;
            }
            rollN();
            if(this.Top == top){
                a = true;
                break;
            }
            rollN();
            if(this.Top == top){
                a = true;
                break;
            }
            turnR();
            if(this.Top == top){
                a = true;
                break;
            }
            turnR();
            if(this.Top == top){
                a = true;
                break;
            }
            turnR();
            if(this.Top == top){
                a = true;
                break;
            }
            i++;
        }
        if(a == true){
            int f = 0;
            while(f < 1){

                if(this.N == n){
                    b = true;
                    break;
                }
                turnR();
                if(this.N == n){
                    b = true;
                    break;
                }
                turnR();
                if(this.N == n){
                    b = true;
                    break;
                }
                turnR();
                if(this.N == n){
                    b = true;
                    break;
                }
                f++;
            }

        }

        if(a == true && b == true && this.E == e){
            ans = "Yes";
        }
        System.out.println(ans);



    }

    public void rollN () {
        int tmp = N;
        N = Top;
        Top = S;
        S = Bottom;
        Bottom = tmp;
    }

    public void turnR () {
        int tmp = E;
        E = N;
        N = W;
        W = S;
        S = tmp;
    }


}

