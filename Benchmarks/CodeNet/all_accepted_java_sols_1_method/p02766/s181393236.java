import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int keta = 1;
        for (int i=0;;i++) {
            N = N / K;
            if(N == 0) {
                break;
            }
            keta++;
        }
        
        System.out.println(keta);
    }
}
