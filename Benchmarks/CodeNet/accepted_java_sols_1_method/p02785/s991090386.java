import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i < N; i++){
            l.add(sc.nextInt());
        }
        l.sort(null);
        long total = 0;
        for(int i = 0; i < l.size()-K; i++){
            total += l.get(i);
        }
        System.out.println(total);
    }
}