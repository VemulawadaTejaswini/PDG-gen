import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lines = line.split(" ", 0);
        long a = Long.parseLong(lines[0]);
        long b = Long.parseLong(lines[1]);
        long c = Long.parseLong(lines[2]);
        long d = Long.parseLong(lines[3]);
        
        long x1 = a * c;
        long x2 = a * d;
        long x3 = b * c;
        long x4 = b * d;

        System.out.println(Math.max(Math.max(x1, x2), Math.max(x3, x4)));
    }
}