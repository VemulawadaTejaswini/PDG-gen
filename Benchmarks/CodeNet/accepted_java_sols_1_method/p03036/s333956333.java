import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int r = Integer.parseInt(params[0]);
        int D = Integer.parseInt(params[1]);
        int x = Integer.parseInt(params[2]);

        int result = x;
        for( int i = 1 ; i <= 10 ; i++ ){
            result = r * result - D;
            System.out.println(result);
        }

    }

}
