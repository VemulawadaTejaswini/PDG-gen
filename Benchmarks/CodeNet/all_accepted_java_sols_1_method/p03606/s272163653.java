import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int total = 0;
        for (int i = 0; i < N; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            total+= (r-l+1);
        }
        
        System.out.println(total);
    }
}