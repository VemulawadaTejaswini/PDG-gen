
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int t[];
        t = new int[N];
        for(int i=0;i<N;i++){
            t[i]=sc.nextInt();
        }
        Arrays.sort(t);
        int a = 0;
        int b = 0;
        for(int i=0;i<N;i++){
            if (i % 2 != 1) {
                a += t[i];
            } else {
                b += t[i];
            }
        }
    
        System.out.println(Math.abs(b-a));
    }
}