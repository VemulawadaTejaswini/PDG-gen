import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  n = sc.nextLine();
        int total = 0;

        for (char i : n.toCharArray())
            total += Integer.parseInt(String.valueOf(i));

        double div = Double.parseDouble(n) / total;

        if (div == (int) div)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
