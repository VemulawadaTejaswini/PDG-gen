import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] va = new int[n];
        int[] ca = new int[n];
        for(int i=0; i<n; i++){
            va[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            ca[i] = sc.nextInt();
        }
        sc.close();

        int total = 0;
        for (int i=0; i<n; i++){
            total += va[i] > ca[i] ? va[i] - ca[i] : 0 ;
        }
        System.out.println(total);
    }
}
