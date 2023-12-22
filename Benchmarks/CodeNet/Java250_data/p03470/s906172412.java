import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0; i<N; i++){
            int d = scanner.nextInt();
            hashSet.add(d);
        }

        System.out.println(hashSet.size());


    }
}
