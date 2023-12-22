import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        List<Integer> tmp = (ArrayList) list.clone();
        Collections.sort(tmp, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int answer = tmp.get(0);
            if (tmp.get(0) == list.get(i)) {
                answer = tmp.get(1);
            }
            System.out.println(answer);
        }
    }
}