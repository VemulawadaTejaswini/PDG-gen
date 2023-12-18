import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        int max = a + b;
        int d = a - b;
        if(d > max) max = d;
        int e = a * b;
        if(e > max) max = e;
        System.out.println(max);
    }
}