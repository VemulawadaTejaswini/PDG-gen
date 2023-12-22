import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        for(int x = 1; x<10000;x++){

            if((int) (x*0.08)==N && (int) (x*0.1)==M){
                System.out.println(x);
                return;
            }
        }
        System.out.println(-1);



    }

}
