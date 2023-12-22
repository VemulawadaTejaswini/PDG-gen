import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N+1];
        int count = 1;
        
        
        for(int i = 1; i <= N; i++) {
           H[i] = sc.nextInt();
        }

        int max = H[1];
        for(int i = 2; i <= N; i++) {
            if (H[i] >= max){
                max = H[i];
                if(  H[i-1] <= H[i]) {
                    count++;
              }
            }
        }
        System.out.println(count);
    }
} 