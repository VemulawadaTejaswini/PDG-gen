import java.util.Scanner;
import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sCount = Integer.parseInt(scanner.nextLine());
        String[] s = scanner.nextLine().split(" ");
        
        int tCount = Integer.parseInt(scanner.nextLine());
        String[] t = scanner.nextLine().split(" ");
        
        int count = 0;
        
        for (int i = 0; i < tCount; i++) {
            for (int j = 0; j < sCount; j++) {
                if (t[i].equals(s[j])) {
                    count++;
                    break;
                }
            }
        }
        
        System.out.println(count);

    }
}

