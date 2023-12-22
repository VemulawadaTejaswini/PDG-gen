import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        boolean TF = false;
        
        for (int i = A; i <= B; i++) {
            if(i % K == 0) {
                TF = true;
                break;
            } 
        }

        if (TF) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}
