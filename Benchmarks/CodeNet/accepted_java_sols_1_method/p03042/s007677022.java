import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int part1 = n / 100;
        int part2 = n % 100;

        if (part1 <= 12 && part2 <=12 && part1 > 0 && part2 > 0) System.out.println("AMBIGUOUS");
        else if ((part1 > 12 || part1 == 0) && part2 <=12 && part2 > 0) System.out.println("YYMM");
        else if ((part2 > 12 || part2 == 0) && part1 <=12 && part1 > 0)   System.out.println("MMYY");
        else if (part1 > 12 && part2 > 12 || part1 == 0 || part2 == 0) System.out.println("NA");
    }
}