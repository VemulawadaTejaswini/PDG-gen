import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String point = sc.nextLine();

        String[] points = point.split(" ");
        int n = Integer.parseInt(points[0]);
        int d = Integer.parseInt(points[1]);

        int d2 = d * 2 + 1;

        //きりあげ
        double kiriage = Math.ceil((double)n / d2);

        System.out.println((int)kiriage);
    }
}