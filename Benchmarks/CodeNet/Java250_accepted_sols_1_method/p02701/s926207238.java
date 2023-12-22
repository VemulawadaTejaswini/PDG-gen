import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<String> hs = new HashSet<String>();

        for(int i=0; i < N; i++){
            hs.add(sc.next());
        }

        System.out.println(hs.size());

        sc.close();
    }
}