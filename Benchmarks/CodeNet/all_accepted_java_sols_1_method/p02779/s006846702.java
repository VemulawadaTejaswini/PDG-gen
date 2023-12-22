import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception{
        // TODO 自動生成されたメソッド・スタブ

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> a = new HashSet<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());

        }
            sc.close();
            if(n == a.size()) {
                System.out.println("YES");
               }
            else {
                System.out.println("NO");
            }


    }

}
