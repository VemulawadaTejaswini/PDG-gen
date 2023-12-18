import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();

        int h = s / 3600;
        s %= 3600;

        int m = s / 60;
        s %= 60;

        System.out.println(h + ":" + m + ":" + s);
    }
}
