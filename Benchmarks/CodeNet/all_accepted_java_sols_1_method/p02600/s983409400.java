import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        int ans = 0;

        if(n < 600){
            ans = 8;
        }else if(n < 800){
            ans = 7;
        }else if(n < 1000){
            ans = 6;
        }else if(n < 1200){
            ans = 5;
        }else if(n < 1400){
            ans = 4;
        }else if(n < 1600){
            ans = 3;
        }else if(n < 1800){
            ans = 2;
        }else if(n < 2000){
            ans = 1;
        }

        System.out.println(ans);
    }
}
