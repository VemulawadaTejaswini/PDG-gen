import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> pList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int p = sc.nextInt();
            pList.add(p);
        }

        Collections.sort(pList, Comparator.reverseOrder());
        pList.set(0, pList.get(0) / 2);

        int answer = 0;
        for (int i : pList){
            answer += i;
        }

        System.out.println(answer);
    }

}
