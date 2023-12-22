//https://atcoder.jp/contests/abc127/tasks/abc127_a

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        if (A>12){
            System.out.println(B);
        } else if (A<6){
            System.out.println(0);
        } else {
            System.out.println(B/2);
        }
    }
}