import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] H = new int[N];
        for (int i=0;i<N;i++){
            H[i]=scanner.nextInt();
        }
        scanner.close();

        int count = 0;

        int max = 0;

        for(int i=0;i<N;i++){
            if (H[i] >= max){
                max = H[i];
                count++;
            }
        }

        System.out.println(count);

//        System.out.println(System.currentTimeMillis() - startTime);
    }
}
