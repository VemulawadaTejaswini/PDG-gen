import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> valueList = new ArrayList<>();
        for (int i=0; i<n; i++){
            valueList.add(sc.nextInt());
        }
        List<Integer> costList = new ArrayList<>();
        for (int i=0; i<n; i++){
            costList.add(sc.nextInt());
        }

        int totalBenefit = 0;

        for (int i=0; i<n; i++){
            int benefit = valueList.get(i) - costList.get(i);
            if (benefit > 0){
                totalBenefit += benefit;
            }
        }

        System.out.println(totalBenefit);
    }
}