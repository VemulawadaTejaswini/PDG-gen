import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer,Integer> A = new HashMap<>();
        for (int i = 0; i < N; i++){
            int a = sc.nextInt();
            if (A.containsKey(a)){
                System.out.println("NO");
                return;
            }
            A.put(a,0);
        }
        System.out.println("YES");
    }
}
