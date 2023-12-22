import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = 0, result = 0;
        Set set = new HashSet();
        for (int i = 0; i < n; i++) {
            temp = scanner.nextInt();
            if (set.contains(temp)) {
                set.remove(temp);
                result--;
            } else {
                set.add(temp);
                result++;
            }
        }
        System.out.println(result);
    }
}