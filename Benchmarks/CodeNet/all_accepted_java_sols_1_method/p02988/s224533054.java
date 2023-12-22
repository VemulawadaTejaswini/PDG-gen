import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        ArrayList<Integer> p = new ArrayList<>();

        for(int i = 0; i < n; i++){
            p.add(sc.nextInt());
        }

        ArrayList<Integer> calcList = new ArrayList<>();
        int ans = 0;
        for(int i = 1; i < n - 1; i++){
            calcList.addAll(p.subList(i - 1, i + 2));
            Collections.sort(calcList);
            if(calcList.get(1).equals(p.get(i))){
                ans++;
            }

            calcList.clear();
        }

        System.out.println(ans);

        return;
    }
}
