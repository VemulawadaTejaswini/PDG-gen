import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> values = new ArrayList<>();

        for(int i = 0; i < n; i ++)
            values.add(sc.nextInt());

        sc.close();

        long ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                ans += values.get(i) * values.get(j);
            }
        }

        System.out.println(ans);

    }
}
