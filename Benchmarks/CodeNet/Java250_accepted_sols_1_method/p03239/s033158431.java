import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int time = scanner.nextInt();

        int min_cost=-1;
        for( int i=0; i< count; i++ ) {
            int n = scanner.nextInt();
            int t = scanner.nextInt();
            if( t <= time ) {
                if( min_cost == -1 || min_cost > n )
                min_cost = n;
            }
        }
        if( min_cost == -1 ) {
            System.out.println("TLE");
        } else {
            System.out.println(min_cost);
        }
    }
}