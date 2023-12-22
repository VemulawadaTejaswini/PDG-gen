import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        String result = "NG";

        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                result= "OK";
                break;
            }
        }
        System.out.println(result);
    }
}

