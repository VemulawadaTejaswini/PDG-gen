import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int m = in.nextInt();
        int d = in.nextInt();
        int total = 0;
        for(int i = 22; i <= d; i++){
            int total_digits = Integer.toString(i).length();
            if (total_digits == 2){
                int copy = i;
                int first = copy % 10;
                copy /= 10;
                int second = copy% 10;
                if (first >= 2 && second >= 2 && first*second >= 1 && first* second <= m){
                    //System.out.println(first + " " + second);
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}