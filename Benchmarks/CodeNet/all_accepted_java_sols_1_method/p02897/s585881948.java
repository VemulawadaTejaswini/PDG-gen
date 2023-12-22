import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double n = Integer.parseInt(sc.nextLine());
        if(n % 2 == 0)  System.out.println(n / 2 / n);
        else    System.out.println(((int)(n / 2) + 1) / n);
    }
}