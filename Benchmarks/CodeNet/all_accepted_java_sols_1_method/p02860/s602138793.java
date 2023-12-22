//package B;
//B - Echo
import java.util.Scanner;

public class Main {
    private Main(int n,String st){
        int flag = 0;
        if (n%2==0) {
            for (int i = 0, j = n / 2; i < n / 2; i++, j++) {
                if (st.charAt(i) == st.charAt(j)) {
                    flag++;
                }
            }
        }
        if (flag==n/2&&n%2==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String st = scanner.next();
        Main echObj = new Main(n,st);
    }
}
