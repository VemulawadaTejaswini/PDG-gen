import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= N; i++){
            if (Integer.toString(i).length()% 2 == 1)
                ans ++;
        }System.out.println(ans);
    }

}