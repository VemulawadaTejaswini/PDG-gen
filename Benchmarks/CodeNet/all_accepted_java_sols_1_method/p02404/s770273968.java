import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int h = scn.nextInt();
        int w = scn.nextInt();

        while ((h != 0) || (w != 0)) {
            for (int i = 0; i < h; i++) {

                if (i == 0 || i == (h-1)) {
                    for (int j = 0; j < w; j++) {
                        System.out.print("#");
                    }

                }else{
                    System.out.print("#");
                    for (int k = 0; k < (w-2); k++) {
                        System.out.print(".");

                    }
                    System.out.print("#");
                }


                System.out.println("");
            }
            System.out.println("");
            h = scn.nextInt();
            w = scn.nextInt();


        }

        scn.close();


    }
}
