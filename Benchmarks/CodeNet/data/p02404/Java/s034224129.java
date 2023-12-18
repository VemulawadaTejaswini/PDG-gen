package src;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            while (true) {
                int H = sc.nextInt();
                int W= sc.nextInt();
                if (H == 0 && W == 0) {
                    break;
                }else{
                    for(int j=0;j<W;j++){
                        System.out.print("#");
                    }
                    System.out.println();
                    for(int i=1;i<H-1;i++) {
                        System.out.print("#");
                        for (int j = 1; j < W - 1; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("#");
                        System.out.println();
                    }
                    for(int j=0;j<W;j++){
                        System.out.print("#");
                    }


                        System.out.println();
                    }

                }

            }
}
