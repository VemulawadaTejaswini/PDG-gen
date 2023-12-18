import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] p = new int[N];
        int c = 0;
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextInt();
        }
        for(int i=0; i < p.length-1; i++) {
            for(int j=0; j < p.length-i-1; j++) {
            	if(p[j] > p[j+1]) {
            		int asc = p[j];
            		p[j] = p[j+1];
                    p[j+1] = asc;
                }
            }
        }
        for (int i = 0; i < K; i++) {
            c = c + p[i];
        }
        System.out.println(c);
    }
}