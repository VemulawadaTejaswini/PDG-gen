import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int fh = 0;
        int five = 0;

        fh = x/500;
        x-=fh*500;

        five = x/5;

        System.out.println(fh*1000+five*5);

    }

}
