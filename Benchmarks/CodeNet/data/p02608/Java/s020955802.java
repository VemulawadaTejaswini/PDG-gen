import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans[] = new int [N];

        for (int flg = 1; flg <= N; flg++) {
            double temp = Math.round(Math.sqrt(flg));
            for (int a = 1; a < temp; a++) {
                for (int b = 1; b < temp; b++) {
                    for (int c = 1; c < temp; c++) {
                        int math = a*a + b*b + c*c + a*b + b*c + c*a;
                        if (math == flg) {
                            ans[flg-1]++;
                        }
                    }
                }
            }
            System.out.println(ans[flg-1]);
        };
    }
}