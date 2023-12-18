import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N];

        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < N-2; i++) {
            int a = L[i];
            for (int j = i+1; j < N-1; j++) {
                int b = L[j];
                for (int k = j+1; k < N; k++) {
                    int c = L[k];
                    if (a+b>c && b+c>a && c+a>b) {
                    	if (a != b && b != c && c != a) {
                            count++;

                    	}
                    }
                }
            }
        }
        System.out.println(count);
    }
}