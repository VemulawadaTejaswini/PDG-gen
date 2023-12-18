import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int g = M/N;
        while(M%g!=0) g--;
        System.out.println(g);
    }
}