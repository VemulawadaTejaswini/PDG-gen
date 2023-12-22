import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int cnt = x/100;
        int amr = x%100;

        String ans = "1";
        if(cnt < 20 && amr > 5*cnt) {
            ans = "0";
        }

        System.out.println(ans);
    }
}