import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int y = scn.nextInt();
        int ans = 1;

        while(true){
            if(x == 0) {
                ans = y;
                break;
            }
            if(y == 0) {
                ans = x;
                break;
            }

            if(x > y){
                x %= y;
            }
            else{
                y %= x;
            }
        }

        System.out.println(ans);

    }
}
