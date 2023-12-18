import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();

        long sum = 100; 
        long year = 0; 
        while (sum < X) {
            sum += sum/100;
            year++;
        }

        System.out.println(year);
    }
}