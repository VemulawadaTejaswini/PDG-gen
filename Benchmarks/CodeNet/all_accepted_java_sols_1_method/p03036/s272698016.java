import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int r = stdIn.nextInt();
        int D = stdIn.nextInt();
        int[] x = new int[11];
        x[0] = stdIn.nextInt();
        for(int i = 1; i <= 10; i++){
            x[i] = r *x[i-1] - D;
            System.out.println(x[i]);
        }
   }
}