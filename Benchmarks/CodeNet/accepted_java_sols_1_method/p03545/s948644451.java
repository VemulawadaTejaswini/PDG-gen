import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner((System.in));

        //System.out.print("4桁の整数を入力してください\n4桁の整数:");
        int ABCD = stdIn.nextInt();

        int A = ABCD / 1000;
        int B = (ABCD - A * 1000) / 100;
        int C = (ABCD - A * 1000 - B * 100) / 10;
        int D = ABCD - (A * 1000 + B * 100 + C * 10);

        if ((A + B + C + D) ==7){
            System.out.print(A + "+" + B + "+" + C + "+" + D  + "=7");
        }
        else if((A + B + C - D)== 7){
            System.out.print(A + "+" + B + "+" + C + "-" + D + "=7");
        }
        else if((A + B - C + D)== 7){
            System.out.print(A + "+" + B + "-" + C + "+" + D + "=7");
        }
        else if((A - B + C + D)== 7){
            System.out.print(A + "-" + B + "+" + C + "+" + D + "=7");
        }
        else if((A + B - C - D)== 7){
            System.out.print(A + "+" + B + "-" + C + "-" + D + "=7");
        }
        else if((A - B - C - D)== 7){
            System.out.print(A + "-" + B + "-" + C + "+" + D + "=7");
        }
        else if((A - B + C - D)== 7){
            System.out.print(A + "-" + B + "+" + C + "-" + D + "=7");
        }
        else System.out.print(A + "-" + B + "-" + C + "+" + D + "=7");
    }
}
