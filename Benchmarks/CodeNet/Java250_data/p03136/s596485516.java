import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int acc = 0;
        int max = 0;
        for(int i=0; i<N; i++){
            int tmp = scanner.nextInt();
            acc += tmp;
            max = Math.max(max, tmp);
        }

        if(acc - max > max){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
