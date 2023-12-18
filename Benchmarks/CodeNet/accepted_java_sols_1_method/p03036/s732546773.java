import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int D = sc.nextInt();
        int[] x = new int[11];
        x[0] = sc.nextInt();

        for(int i=1; i<=10; i++){
            x[i] = x[i-1] * r - D;
            System.out.println(x[i]);
        }

    }
}