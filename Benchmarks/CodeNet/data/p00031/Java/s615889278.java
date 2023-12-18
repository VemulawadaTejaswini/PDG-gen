import java.util.*;

class Main {

    static void solve (int n) {
        int weight = 2;
        boolean first = true;

        while (n != 0) {
            if (n % weight != 0) {
                if (!first) System.out.printf(" %d", weight / 2);
                else {
                    System.out.print(weight / 2);
                    first = false;
                }
                    
                n -= weight / 2;
            }
            weight *= 2;
        }
        
        System.out.println("");

    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int n = sc.nextInt();
            solve(n);
        }

    }
}