import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() % 10;
        String ans = "hon";
        if(n==3) {
            ans = "bon";
        }
        else if(n==0 || n==1 || n==6 || n==8) {
            ans = "pon";
        }
        System.out.println(ans);
    }
}
