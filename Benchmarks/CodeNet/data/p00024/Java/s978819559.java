import java.util.*;

class Main {

    static void solve ( double speed ) {
        double time = speed / 9.8;
        double height = 4.9 * time * time;

        System.out.println( (int)(height / 5) + 2 );
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            double speed = sc.nextDouble();
            solve(speed);
        }

    }
}