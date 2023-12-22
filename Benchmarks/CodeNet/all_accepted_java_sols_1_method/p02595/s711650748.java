import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int count = 0;
        for (int i = 0 ; i < N ; i++ ) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (Math.sqrt(Math.pow(x,2) + Math.pow(y,2)) <= D)
                count++;
        }
        System.out.println(count);
    }
}
