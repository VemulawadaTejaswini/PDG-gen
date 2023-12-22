import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long[] capacities = new long[5];

        for (int i=0; i < 5; i++) {
            capacities[i] = sc.nextLong();
        }

        Arrays.sort(capacities);

        long adjuster = (N%capacities[0] != 0) ? 1 : 0;
        System.out.println(N/capacities[0] + 4 +  adjuster);
    }
}
            
