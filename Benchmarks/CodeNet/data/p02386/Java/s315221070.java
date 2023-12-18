import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class Main {
    static int[] dice;
    static int[] diceb;
    static int a;
    static int b;
    static int c;
    static int d;
    static int tmp;
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        tmp = 0;

        // first_dice
        dice = new int[6];
        for(int i=0; i<6; i++) {
            dice[i] = sc.nextInt();
        }

        for(int j=0; j<x-1; j++) {
	        diceb = new int[6];
	        for(int i=0; i<6; i++) {
	            diceb[i] = sc.nextInt();
	        }

	        int a = diceb[0];
	        int b = diceb[1];
	        int count = 0;
	        while(true) {
	            diceRoll();
	            count++;
	            if(dice[0]==a && dice[1]==b || count==100) {
	                break;
	            }
	        }

	        if(dice[2]==diceb[2] && dice[3]==diceb[3] && dice[4]==diceb[4] && dice[5]==diceb[5]) {
	            tmp++;
	        }
        }

        if(tmp>0) {
        	System.out.println("No");
        }else {
        	System.out.println("Yes");
        }

        sc.close();
    }

    public static void diceRoll() {
        Random rand = new Random();
        int num = rand.nextInt(4);
        if(num==0) {
            s();
        }else if(num==1) {
            n();
        }else if(num==2) {
            w();
        }else if(num==3){
            e();
        }
    }

    public static void s() {
        a = dice[0];
        b = dice[1];
        c = dice[4];
        d = dice[5];

        dice[0] = c;
        dice[1] = a;
        dice[4] = d;
        dice[5] = b;
    }

    public static void w() {
        a = dice[0];
        b = dice[2];
        c = dice[3];
        d = dice[5];

        dice[0] = b;
        dice[2] = d;
        dice[3] = a;
        dice[5] = c;
    }

    public static void e() {
        a = dice[0];
        b = dice[2];
        c = dice[3];
        d = dice[5];

        dice[0] = c;
        dice[2] = a;
        dice[3] = d;
        dice[5] = b;
    }

    public static void n() {
        a = dice[0];
        b = dice[1];
        c = dice[4];
        d = dice[5];

        dice[0] = b;
        dice[1] = d;
        dice[4] = a;
        dice[5] = c;
    }
}
