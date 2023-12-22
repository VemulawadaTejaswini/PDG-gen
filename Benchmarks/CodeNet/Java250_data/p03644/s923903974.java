import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int divCnt;
        int maxDivCnt = 0;
        int maxN = 1;

        for (int i = 1; i <= N; i++) {

            divCnt = divCnt(i);
            if(maxDivCnt < divCnt) {
                maxDivCnt = divCnt;
                maxN = i;
            }
        }
        System.out.println(maxN);
    }

    private static int divCnt(int i) {
        int cnt = 0;
        return divCnt(i, cnt);
    }

    private static int divCnt(int i,int cnt) {
        if(i/2 >= 1 && i%2 == 0) {
            i = i /2;
            cnt = divCnt(i,cnt);
            cnt ++;
        }
        return cnt;
    }

}