

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int a = sn.nextInt();
        int b = sn.nextInt();

        
        int min = b -a +1;
        int max = b + a -1;

        
        for(int i = min; i <= max; i++){
         System.out.println(i);
        }
    }
}