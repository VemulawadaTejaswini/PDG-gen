import java.util.Scanner;

public class Main {
   static  Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int x,y,a;
        int left = 0;
        int under = 0;
        int width = s.nextInt();
        int height = s.nextInt();
        int n = s.nextInt();
        
        for (int i = 0; i < n; i++) {
            x = s.nextInt();
            y = s.nextInt();
            a = s.nextInt();

            switch (a) {
                case 1:
                    if (left < x) {
                        left = x;
                    }
                    break;
                case 2:
                    if (width > x) {
                        width = x;
                    }
                    break;
                case 3:
                    if (under < y) {
                        under = y;
                    }
                    break;
                case 4:
                    if (height > y) {
                        height = y;
                    }
                    break;
            }
        }

        if (width < left || height < under) {
            System.out.println(0);
        } else {
            System.out.println((width-left) * (height-under));
        }
    }
}