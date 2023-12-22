import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();

        double sqr = (double)w*h/2;
        System.out.println(sqr);

        if ((w%2!=0)|(h%2!=0)){
            System.out.println(0);
        } else if ((x==w/2)&(y==h/2)){
                System.out.print(1);
            } else {
            System.out.print(0);
        }


    }
}

