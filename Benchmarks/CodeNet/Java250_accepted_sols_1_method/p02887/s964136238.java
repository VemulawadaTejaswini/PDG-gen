import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        String slimes = sc.next();
        StringBuilder ans = new StringBuilder();
        String[] slimesarr = new String[n+1];

        for (int i = 0; i < n; i++) {
            slimesarr[i] = String.valueOf(slimes.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            if(slimesarr[i].equals(slimesarr[i+1])){

            }else{
                ans.append(slimesarr[i]);
            }
        }

        System.out.println(ans.toString().length());
    }
}
