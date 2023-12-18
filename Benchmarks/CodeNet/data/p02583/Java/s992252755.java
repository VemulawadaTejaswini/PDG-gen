
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        
        final int[] Ls = new int[N];
        for (int n = 0; n < N; n++) {
            Ls[n] = sc.nextInt();
        }
        
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (Ls[i] == Ls[j]) {
                    continue;
                }
                for (int k = j + 1; k < N; k++) {
                    if (Ls[i] != Ls[k]
                            && Ls[j] != Ls[k]
                            &&  Math.max(Math.max(Ls[i], Ls[j]), Ls[k]) * 2 < Ls[i] + Ls[j] + Ls[k]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
