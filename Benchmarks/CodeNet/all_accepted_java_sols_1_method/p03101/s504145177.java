import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        //入力
        Scanner scn=new Scanner(System.in);
        int w_h=scn.nextInt();
        int w_w=scn.nextInt();
        int b_h=scn.nextInt();
        int b_w=scn.nextInt();
        //処理と出力
        System.out.println((w_h-b_h)*(w_w-b_w));
    }
}