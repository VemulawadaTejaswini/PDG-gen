import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        n--;
        List<Character> ansList = new ArrayList<>();
        while (n>=0) {
            long nAns = n % 26 + 97;
            ansList.add((char) nAns);
            n = n / 26 - 1;
        }

        for (int i=ansList.size()-1;i>=0;i--) {
            System.out.print(ansList.get(i));
        }
        System.out.println();
    }
}
