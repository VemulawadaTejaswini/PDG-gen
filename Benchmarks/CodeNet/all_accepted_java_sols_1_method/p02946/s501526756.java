import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int k = Integer.parseInt(line1[0]);
        int x = Integer.parseInt(line1[1]);
        for(int i = x - k + 1; i <= x + k - 1; i++) System.out.print(i + " ");
    }
}