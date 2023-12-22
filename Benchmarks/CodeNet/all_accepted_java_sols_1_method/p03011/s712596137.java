import java.util.Scanner;

/**
 * ABC129 A
 *
 */
public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            b = sc.nextInt();
            c= sc.nextInt();
        }
        int sum = a + b +c;
        int max = 0;
        if(a >= b && a  >= c){
            max  = a;
        }else if(b >= a && b  >= c){
            max = b;
        }else{
            max = c;
        }

        System.out.println(sum - max);
    }

}
