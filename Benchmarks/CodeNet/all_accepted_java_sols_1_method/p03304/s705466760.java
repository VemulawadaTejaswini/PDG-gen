import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());

        double prob = 0;
        if (d==0) prob=(double)1/n;
        else prob=(double)2*(n-d)/n/n;
        System.out.println(prob*(m-1));
    }
}