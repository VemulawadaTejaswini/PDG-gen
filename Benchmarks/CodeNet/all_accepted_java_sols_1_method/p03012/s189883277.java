import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list  = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < n; i++){
            int a = sc.nextInt();
            list.add(a);
            sum += a;
        }

        int minDifference = sum;
        int calc = 0;

        for (int num : list){
            calc += num;

            if (Math.abs(sum - calc - calc) < minDifference){
                minDifference = Math.abs(sum - calc - calc);
            }
        }

        System.out.println(minDifference);
    }

}