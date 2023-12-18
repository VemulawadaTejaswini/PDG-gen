import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int amount = 0;
        int maxPrice = 0;
        for (int i = 0; i < N; i++){
            int p = sc.nextInt();
            amount += p;
            if(p > maxPrice) maxPrice = p;
        }
        sc.close();
        amount -= maxPrice / 2;
        System.out.println(amount);

    }

}
