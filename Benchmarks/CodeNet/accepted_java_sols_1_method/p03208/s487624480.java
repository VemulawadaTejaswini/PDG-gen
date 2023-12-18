import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> hList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int h = sc.nextInt();
            hList.add(h);
        }

        Collections.sort(hList, Comparator.reverseOrder());

        int answer = hList.get(0);

        for (int i = 0; i < n - k + 1; i++){
            int sabun = hList.get(i) - hList.get(i + k - 1);
            if (sabun < answer){
                answer = sabun;
            }
        }

        System.out.println(answer);
    }
}
