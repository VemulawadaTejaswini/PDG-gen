import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            IntStream line = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .sorted();
            int[] il = line.toArray();
            int a = il[0];
            int b = il[1];
            System.out.println(gcd(a, b) + " " + lcm(a, b));
        }
    }

    private static int gcd(int a, int b){
        int base = Math.max(a, b);
        int next = Math.min(a, b);
        int residue = base % next;
        while (residue != 0){
            residue =  base % next;
            base = next;
            next = residue;
        }
        return base;
    }

    private static int lcm(int a, int b){
        int g = gcd(a, b);
        return a / g * b;
    }
}