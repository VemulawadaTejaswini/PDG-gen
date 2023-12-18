import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(10 > N){
            if(N == 2 || N == 4 || N == 5 || N == 7 || N == 9){
                System.out.println("hon");
            } else if(N == 0 || N == 1 || N == 6 || N == 8) {
                System.out.println("pon");
            } else {
                System.out.println("bon");
            }
        } else {
            String num = "";
            String one = "";
            num = String.valueOf(N);
            if(100 > N) {
                one = num.substring(1, 2);
            } else {
                one = num.substring(2, 3);
            }
            N = Integer.parseInt(one);
            if(N == 2 || N == 4 || N == 5 || N == 7 || N == 9){
                System.out.println("hon");
            } else if(N == 0 || N == 1 || N == 6 || N == 8) {
                System.out.println("pon");
            } else {
                System.out.println("bon");
            }
        }
    }
}
