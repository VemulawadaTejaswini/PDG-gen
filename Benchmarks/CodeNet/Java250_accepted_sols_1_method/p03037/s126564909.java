import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int max = N;
        int min = Integer.MIN_VALUE;

        for(int i=0; i<M; i++){
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            min = Math.max(min, l);
            max = Math.min(max, r);
        }

        if(max < min){
            System.out.println(0);
        }else {
            System.out.println(max-min+1);
        }

    }
}
