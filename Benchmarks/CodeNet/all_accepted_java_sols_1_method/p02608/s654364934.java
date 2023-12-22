import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans[] = new int [10000000];

        for (int a = 1; a <=100; a++) {
            for (int b = 1; b <=100; b++) {
                for (int c = 1; c <=100; c++) {
                    int math = a*a + b*b + c*c + a*b + b*c + c*a;
                    ans[math-1]++;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(ans[i]);
        }
    }
}