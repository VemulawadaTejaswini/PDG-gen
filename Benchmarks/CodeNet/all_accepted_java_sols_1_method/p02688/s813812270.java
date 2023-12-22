import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<K; i++){
            int d = sc.nextInt();
            for(int j=0; j<d; j++){
                hs.add(sc.nextInt());
            }
        }

        System.out.println(N-hs.size());

        sc.close();
        
    }
}