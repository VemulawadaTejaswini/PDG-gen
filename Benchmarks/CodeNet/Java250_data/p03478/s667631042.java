import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        List<Integer> totalList = new ArrayList<Integer>();
        for(int i=0; i<= n; i++) {
            int sum = gettotal(i);

            if (a <= sum && b >= sum) {
                totalList.add(i);
            }
        }

        int res = 0;
        for (int i=0; i < totalList.size(); i++) {
            res = res + totalList.get(i);
        }
        System.out.print(res);
    }

    private static int gettotal(int i) {
        int sum = 0;
        while(i !=0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}

