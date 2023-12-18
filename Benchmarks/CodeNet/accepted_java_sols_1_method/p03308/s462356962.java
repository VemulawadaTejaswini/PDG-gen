import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            if(a < min) min = a;
            if(a > max) max = a;
        }
        System.out.println(max - min);
        sc.close();

    }

}
