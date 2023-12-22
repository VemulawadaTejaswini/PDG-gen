import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {
            list.add(sc.nextInt());
        }
        int n5=0, n7=0;
        for (int n:list) {
            if (n==5) n5++;
            if (n==7) n7++;
        }
        System.out.println(n5==2&&n7==1 ? "YES" : "NO");
    }
}
