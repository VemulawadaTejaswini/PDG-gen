import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        int n = sc.nextInt();
        int min = 0;
        int max = 0;
        long sum = 0;

        for (int i=0; i<n; ++i) {
            arr.add(sc.nextInt());
        }
        
        for (int i=0; i<arr.size(); ++i) {
            sum += arr.get(i);
            
            if (arr.get(i) > max || i == 0) max = arr.get(i);
            if (arr.get(i) < min || i == 0) min = arr.get(i);
        }

        System.out.println(min + " " + max + " " + sum);
    }
}
