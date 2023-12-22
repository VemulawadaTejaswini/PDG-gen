import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int output = 0;
        for(int i=a; i<=b; i++) {
            int tmp = i;
            int[] num = new int[5];
            int loopCnt = 0;
            while(loopCnt < 5) {
                num[loopCnt] = tmp % 10;
                if(tmp / 10 > 0) {
                    tmp /= 10;
                } else {
                    break;
                }
                loopCnt++;
            }
            if(num[0] == num[4] && num[1] == num[3]) {
                output++;
            }
        }
        System.out.println(output);
    }
}
