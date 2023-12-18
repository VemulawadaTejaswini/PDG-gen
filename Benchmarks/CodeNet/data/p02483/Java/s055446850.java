import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] x = new int[3];
        Scanner in = new Scanner(System.in);
        x[0] = in.nextInt();
        x[1] = in.nextInt();
        x[2] = in.nextInt();
       
        Arrays.sort(x);
       
        for(int i = 0; i < 3; i++){
            System.out.print(x[i] + " ");
        }
    }
}