import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] arr = new char[55][55];
        for(int i = 1; i <= H; i++) {
            String tmp = sc.next();
            for(int j = 1; j <= W; j++) {
                char c = tmp.charAt(j-1);
                arr[i][j] = c;
            }
        }
        int cnt = 0;
        for(int i = 1; i <= H; i++) {
            for(int j = 1; j <= W; j++) {
                if(arr[i][j] == '#' && arr[i][j-1] == '.' && arr[i][j+1] == '.' && arr[i-1][j] == '.' && arr[i+1][j] == '.') cnt++;
            }
        }
        if(cnt == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
