
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        long year = 0;
        long m = 100;
        while(m < x){
            m = m/100 + m;
            year++;
        }
        System.out.println(year);
        sc.close();
    }
}