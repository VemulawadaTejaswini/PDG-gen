import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean app = true;
        for(int i=0; i<n; i++) {
            int a = in.nextInt();
            if(a%2==0) {
                if(a%3==0 || a%5==0) {
                    // OK
                }
                else {
                    app = false;
                }
            }
        }
        System.out.println(app?"APPROVED":"DENIED");
    }
}
