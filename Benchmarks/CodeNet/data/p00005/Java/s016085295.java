import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] line = sc.nextLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
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