import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();

        if(N % (2 * D + 1) == 0){
            System.out.println(N / (2 * D + 1));
        }else{
            System.out.println(N / (2 * D + 1) + 1);
        }

        sc.close();
    }
}