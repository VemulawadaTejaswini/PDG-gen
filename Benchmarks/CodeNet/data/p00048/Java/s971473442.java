import java.util.*;

class Main {

    static void solve (double w) {
        String res = "";

        if ( w <= 48.0 )        res = "light fly";
        else if ( w <= 51.0 )   res = "fly";
        else if ( w <= 54.0 )   res = "bantam";
        else if ( w <= 57.0 )   res = "feather";
        else if ( w <= 60.0 )   res = "light";
        else if ( w <= 64.0 )   res = "light welter";
        else if ( w <= 69.0 )   res = "welter";
        else if ( w <= 75.0 )   res = "light middle";
        else if ( w <= 81.0 )   res = "middle";
        else if ( w <= 91.0 )   res = "light heavy";
        else                    res = "heavy";

        System.out.println(res);

    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double weight = sc.nextDouble();
            solve(weight);
        }

    }
}