
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int countFive = 0;
        int countSeven = 0;

        if (a == 5) {
            countFive++;
        }
        else if( a == 7){
            countSeven++;
        }
        if (b == 5) {
            countFive++;
        }
        else if (b == 7) {
            countSeven++;
        }
        if(c == 5 ) {
            countFive++;
        }
        else if(c == 7 ){
            countSeven++;
        }
        if( countFive == 2 && countSeven == 1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}