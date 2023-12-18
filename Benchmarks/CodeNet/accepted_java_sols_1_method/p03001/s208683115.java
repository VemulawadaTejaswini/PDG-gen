import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        double a = (double) W * H / 2;
        int dup = 0;
        if(x*2==W && y*2==H) {
            dup = 1;
        }

        System.out.println(a + " " + dup) ;

    }

}
