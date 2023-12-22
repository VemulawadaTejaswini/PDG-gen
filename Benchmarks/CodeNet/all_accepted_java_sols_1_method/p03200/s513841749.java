import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) == 'B' ? 1 : 0;
        }

        long sum = 0;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if(arr[i] == 0){
                sum += i - num;
                num++;
            }
        }
        System.out.println(sum);
    }
}