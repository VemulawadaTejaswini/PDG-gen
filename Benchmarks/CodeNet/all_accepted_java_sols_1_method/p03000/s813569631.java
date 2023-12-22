import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();

        int prev = 0;
        int cnt = 1;

        for(int i=0; i<N; i++){
            int diff = scanner.nextInt();

            if(X < prev + diff ){
               break;
            }
            cnt++;
            prev += diff;
        }

        System.out.println(cnt);
    }
}