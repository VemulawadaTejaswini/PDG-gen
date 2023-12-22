import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int count = 0;

        int max = 0;

        for(int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if(max <= num) {
                max = num;
                count++;
            }
        }

        System.out.println(count);

    }
}