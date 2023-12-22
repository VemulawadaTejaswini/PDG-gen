

import java.util.Scanner;
import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int add  = (A+B);

        if (add%2 == 1){
            System.out.println("IMPOSSIBLE");
        }
        else{
            System.out.println(add/2);
        }
    }
}
