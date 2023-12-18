//package beginner176;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        int T = in.nextInt();
        int cnt = N / X;
        if(N % X != 0){
            cnt++;
        }
        System.out.println(cnt * T);
    }
}
