import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int a;
        while (true) {
            int c = 0;
            a = sc.nextInt();
            if (a == 0) break;
            for (int i = 0; i < a; i++) {
                int sum = 0;
                for (int j = i; j < a; j++) {
                    sum += j;
                    if (sum == a) c++;
                }
            }
            list.add(c);
        }
        list.stream().forEach(x -> System.out.println(x));
    }
}

