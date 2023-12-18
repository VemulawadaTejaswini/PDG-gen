import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        int c = Integer.parseInt(line1[2]);
        int d = c - (a - b);
        if(d <= 0)  d = 0;
        System.out.println(d);
    }
}