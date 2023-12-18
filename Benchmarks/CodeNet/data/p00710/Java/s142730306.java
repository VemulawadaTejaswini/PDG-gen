import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r, p, c;
        while(true){
            n = sc.nextInt();
            r = sc.nextInt();
            if (n == 0 && r == 0) break;
            int deck[] = new int[n];
            int tmp[] = new int[n];
            for (int i = 0; i < n; i++) deck[i] = n - i;
            for (int i = 0; i < r; i++){
                p = sc.nextInt();
                c = sc.nextInt();
                System.arraycopy(deck,p-1, tmp,0, c);
                System.arraycopy(deck,0, deck, c, p-1);
                System.arraycopy(tmp,0, deck,0, c);
            }
            System.out.println(deck[0]);
        }
    }
}