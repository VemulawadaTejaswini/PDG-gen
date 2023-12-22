import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] t = new int[N+1];
        t[0]= 0;
        int[] x = new int[N+1];
        x[0]= 0;
        int[] y = new int[N+1];
        x[0]= 0;
        
        for (int i = 1; i <= N; i++){
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            int abs_t = t[i + 1] - t[i];
            int abs_x = Math.abs(x[i + 1] - x[i]);
            int abs_y = Math.abs(y[i + 1] - y[i]);
            if(abs_t < abs_x + abs_y || abs_t % 2 != (abs_x + abs_y) % 2 ) {
                System.out.println("No");
                System.exit(0);
            } 
        }
        System.out.println("Yes");
    }
}