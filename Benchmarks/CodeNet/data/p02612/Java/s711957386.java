import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int charge = 0;
        if (N % 1000 == 0) {
            charge = 0;
        } else {
            charge = 1000 - (N % 1000);
        }
        
        System.out.println(charge);
    }
}