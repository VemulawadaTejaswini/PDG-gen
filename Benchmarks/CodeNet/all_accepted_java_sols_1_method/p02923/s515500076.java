import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        
        int N = Integer.parseInt(input1);
        String[] ns = input2.split(" ");
        
        boolean[] bools = new boolean[ns.length];
        for (int i = 1; i < ns.length; i++) {
            int a = Integer.parseInt(ns[i - 1]);
            int b = Integer.parseInt(ns[i]);
            if (a >= b) {
                bools[i - 1] = true;
            }
        }
        
        int ans = 0;
        int count = 0;
        for (int i = 0; i < ns.length; i++) {
            if (bools[i]) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
                continue;
            }
        }
        ans = Math.max(count, ans);
        
        System.out.println(ans);
    }
}