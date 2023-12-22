import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        System.out.println(N % ((2 * D) + 1) == 0 ? N / ((2 * D) + 1) : N / ((2 * D) + 1) + 1);
    }
}
