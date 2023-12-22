import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int sum = 0;
        while (n1 <= n2){
            if(isPalindrome(n1)){
                sum++;
            }
            n1++;
        }
        System.out.println(sum);
    }

    private static boolean isPalindrome(int n1) {
        String str = Integer.toString(n1);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString().equals(str);
    }
}