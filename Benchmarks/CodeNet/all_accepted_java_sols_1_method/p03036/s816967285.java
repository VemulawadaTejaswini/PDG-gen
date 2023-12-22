import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x_2000 = Integer.parseInt(sc.next());
        int[] x = new int[11];
        x[0] = x_2000;

        for(int i = 1; i < 11; i++){
            x[i] = r * x[i - 1] - d;
        }

        for(int i = 1; i < 10; i++){
            System.out.println("" + x[i] + "\n");
        }
        System.out.println(x[10]);
    }
}
