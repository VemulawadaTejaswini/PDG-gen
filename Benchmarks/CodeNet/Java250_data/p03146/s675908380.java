import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.close();
        System.out.println(collatz(N));
    }

    private static int collatz(int x) {
        List<Integer> list = new ArrayList<>();
        int n = x;
        while(true) {
            list.add(n);
            int num = 0;
            if(n%2 == 0) {
                num= n/2;
            } else {
                num = 3 * n + 1;
            }
            if(list.contains(num)) {
                return list.size() + 1;
            }

            n = num;
        }
    }

}

