import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] boss = new int[N];

        for(int i= 0 ; i < N-1 ; i++) {
            boss[sc.nextInt()-1]++;
        }
        for(int i = 0 ; i < N ; i++) {
            System.out.println(boss[i]);
        }
    }
}
