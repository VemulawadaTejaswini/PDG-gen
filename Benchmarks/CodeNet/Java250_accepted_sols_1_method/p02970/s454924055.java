import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int D =  Integer.parseInt(sc.next());
        int ans = (int)Math.ceil(N / ((D * 2)+1.0));
        System.out.println(ans);
    }
}