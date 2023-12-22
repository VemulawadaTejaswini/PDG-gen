import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
//        自分のターンが終わった時点で、間のマスの数が偶数だったらよい
//        自分のターンが回ってきたときに間の数が奇数なら前に進み、偶数なら後ろに進むのが最適解
        if((b-a+1)%2 == 0 ){
            System.out.println("Borys");

        }else{
            System.out.println("Alice");
        }

    }
}
