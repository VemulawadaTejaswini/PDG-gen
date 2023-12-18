import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int max = 0;
        int cnt = 0;

        for(int i=0; i<N; i++){
            int tmp = scanner.nextInt();

            if(max < tmp){
                cnt += tmp - max;
                max = tmp;
            }

            if(tmp < max){
                max = tmp;
            }
        }

        System.out.println(cnt);

    }
}
