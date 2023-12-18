import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sa =abs( a - b);
        int min = Math.min(a, b);

        boolean result = min + sa <= 8;
        if(result){
            System.out.println("Yay!");
        }else{
            System.out.println(":(");
        }

        //System.out.println((a + b + c) + "" + s);

        //"Yay!"
//":("
    }
}
