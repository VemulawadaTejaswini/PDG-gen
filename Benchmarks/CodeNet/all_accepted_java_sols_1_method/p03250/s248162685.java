import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ans = new int[3];
        for (int i = 0; i < 3; i++) {
            ans[i] = sc.nextInt();
        }
        Arrays.sort(ans);

        System.out.println(Integer.parseInt(String.valueOf(ans[2]).concat(String.valueOf(ans[1]))) + ans[0]);
    }
}