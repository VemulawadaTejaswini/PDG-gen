/*
@author James Fisher
@date
@version
*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n + 1];

        for(int i = 1; i <= n; i++){
            array[i] = scanner.nextInt();
        }

        for(int i = 1; i <= n; i++){
            System.out.printf("node %d: key = %d, ", i, array[i]);
            if(i/2 > 0)
                System.out.printf("parent key = %d, ", array[i/2]);
            if(2*i <= n)
                System.out.printf("left key = %d, ", array[2*i]);
            if((2*i + 1) <= n)
                System.out.printf("right key = %d, ", array[2*i+1]);

            System.out.print("\n");
        }
    }
}

