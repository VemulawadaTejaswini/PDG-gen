import java.util.Scanner;
class Main{
     public static void main(String args[]){
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        int X = stdin.nextInt();
        int T = stdin.nextInt();
        int try_num = N / X;
        if (N % X != 0) try_num++;
        System.out.println(try_num * T);
    }
}