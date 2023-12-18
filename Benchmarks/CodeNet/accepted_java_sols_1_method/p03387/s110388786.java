import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                String[] strs = sc.nextLine().split(" ");
                int a = Integer.parseInt(strs[0]);
                int b = Integer.parseInt(strs[1]);
                int c = Integer.parseInt(strs[2]);
                int sum = a+b+c;
                int m = Math.max(a, Math.max(b,c));
                System.out.println((((m*3-sum)%2 == 0)?(m*3-sum)/2:(m*3 + 3-sum)/2));
            }
        }
    }
}