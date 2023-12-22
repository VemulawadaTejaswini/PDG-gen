

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(B == 1)
            System.out.println(0);
        else if(B <= A)
            System.out.println(1);
        else {
            int i = 2;
            while (true) {
                if((A - 1) * i + 1 >= B) {
                    System.out.println(i);
                    break;
                }
                ++i;
            }
        }
    }

}
