
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();

        while (w != -1) {
            int total = 0;
            if (w > 10) {
                if (w <= 20) {
                    total += (w - 10) * 125;
                 
                } else {
                    total += 1250;
                    if (w > 20) {
                        if (w <= 30) {
                            total += (w - 20) * 140;
                           
                        } else {
                            total += 1400;
                            if (w > 30) {
                                total += (w - 30) * 160;
                            }
                        }
                    }

                   
                }

            }
                        System.out.println(4280 - (1150 + total));
                    w = scan.nextInt();
        }
    }
}
