import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        long ans = 1l;
        long std = 1000000000000000000l;
        for (int i1 = 0; i1 < i; i1++) {
            long mul = scanner.nextLong();
            if(mul == 0){
                System.out.println(0);
                return;
            }
            if(mul > (std / ans)){
                System.out.println(-1);
                return;
            }else{
                ans *= mul;
            }
        }
    }
}
