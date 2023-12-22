import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int backUp = N;
        int ans = 0;
        while(N!=0){
            ans += N%10;
            N = N/10;
        }
        String t="Yes";
        if(backUp%ans!=0) t="No";
        System.out.println(t);
    }
}