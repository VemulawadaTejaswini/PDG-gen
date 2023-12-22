import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = 1;
        while(sq*sq <= n){
            sq++;
        }
        sq--;
        System.out.println(sq*sq);
        sc.close();
    }

}
