import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        int sum = 0;
        for(char c : a) {
            sum += c - '0';
            sum %= 9;
        }
        System.out.println(sum==0 ? "Yes":"No");


    }



}