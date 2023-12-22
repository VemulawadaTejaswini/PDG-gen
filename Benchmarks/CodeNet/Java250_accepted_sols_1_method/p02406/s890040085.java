import static java.lang.System.out;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 3; i <= n; i++) {
            if (i % 3 == 0 || i % 10 == 3 || i / 10 == 3) {
                out.print(" " + i);
            } else {
                int num = i;
                while(i >= 100) {
                    i = i / 10;
                    if(i % 10 == 3 || i / 10 == 3) {                            
                        out.print(" " + num);
                        break;
                    }
                }
                i = num;
            }
        }
        out.println();
    }
}