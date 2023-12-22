//package basics.AtCoders;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int N = s.nextInt(); //how many pieces made in time
        int X = s.nextInt(); // pieces given
        int T = s.nextInt(); // time
        if(N%X==0){
            System.out.println(N/X*T);
        }
        else {
            System.out.println((N/X+1)*T);
        }


    }
}
