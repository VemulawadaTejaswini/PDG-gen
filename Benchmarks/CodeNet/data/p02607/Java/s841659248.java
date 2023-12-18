import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int R = 0;
        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            
            if (i % 2 == 0 && A % 2 ==1){
                R++;
            }
        }

        System.out.println(R);
    }

    public static void main(String[] args) {
        new Main();
    }
}
