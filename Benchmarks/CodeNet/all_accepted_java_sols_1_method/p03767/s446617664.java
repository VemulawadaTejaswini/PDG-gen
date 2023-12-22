import java.util.*;

public class Main {
    public static void main(String[] aa){
        int N;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i=0; i<3*N; i++){
            a.add(scanner.nextInt());
        }
        Collections.sort(a);

        long sum = 0;
        for (int i=3*N-2, cnt = 0; cnt != N; i-=2, cnt++){
            sum += a.get(i);
        }
        System.out.println(sum);
    }
}
