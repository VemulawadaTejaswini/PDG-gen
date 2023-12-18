import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int count = 0;

        if (a.equals("RRR"))
            count = 3;
        if (a.equals("RRS"))
            count = 2;
        if (a.equals("RSS"))
            count = 1;
        if (a.equals("SSS"))
            count = 0;
        if (a.equals("SSR"))
            count = 1;
        if (a.equals("SRR"))
            count = 2;
        if (a.equals("SRS"))
            count = 1;
        if (a.equals("RSR"))
            count = 1;

        System.out.println(count);

        s.close();
    }
}