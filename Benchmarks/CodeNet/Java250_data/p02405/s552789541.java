import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if(h==0 && w==0)break;
            for (i = 0; i < h; i++) {
                if (i % 2 == 0) {
                    for (j = 0; j < w; j++) {
                        if (j % 2 == 0) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    }
                    System.out.println();
                } else {
                    for (j = 0; j < w; j++) {
                        if (j % 2 == 0) {
                            System.out.print(".");
                        } else {
                            System.out.print("#");
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
