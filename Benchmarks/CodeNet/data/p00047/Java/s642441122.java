import java.util.*;

class Main {

    static char ball = 'A';

    static void swap (char p1, char p2) {
        if ( p1 == ball ) {
            ball = p2;
            return;
        }
        if ( p2 == ball ) {
            ball = p1;
            return;
        }
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String line = sc.nextLine();
            char p1 = line.charAt(0);
            char p2 = line.charAt(2);
            swap(p1, p2);
        }

        System.out.println(ball);
    }
}