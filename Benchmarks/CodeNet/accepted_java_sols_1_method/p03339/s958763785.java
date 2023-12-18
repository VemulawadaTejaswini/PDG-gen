import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int totalEast = 0;
        for(int i = 0; i < N; i++) if(str.charAt(i) == 'E') totalEast++;

        int eastCnt = 0;
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            int leftTurn = i - eastCnt;
            if(str.charAt(i) == 'E') eastCnt++;
            int rightTurn = totalEast - eastCnt;
            arr[i] = rightTurn + leftTurn;
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++) {
            res = Math.min(res, arr[i]);
        }
        System.out.println(res);
    }
}
