import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> v = new ArrayList<>();
        for (int i=0;i<n;i++){
            v.add(scanner.nextInt());
        }
        Collections.sort(v);
        double ans = (((double)v.get(0)) + ((double)v.get(1)))/2;
        for (int i=2;i<n;i++){
            ans = (ans + ((double)v.get(i)))/2;
        }
        System.out.println(ans);

    }

}
