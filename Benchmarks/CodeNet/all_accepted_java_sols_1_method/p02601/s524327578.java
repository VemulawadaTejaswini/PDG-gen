import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        while(r>=g) {
            g*=2;
            k--;
        }
        while(g>=b) {
            b*=2;
            k--;
        }
        if(k>=0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }



}