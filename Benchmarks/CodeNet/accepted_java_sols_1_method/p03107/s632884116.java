import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int zeroCount = 0;
        int oneCount = 0;
        for(char ch : S.toCharArray()) {
            if (ch == '0') zeroCount++;
            if (ch == '1') oneCount++;
        }
        System.out.println(Math.min(zeroCount, oneCount) * 2);
    }
}