import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        if(0 <= S && S < 86400){
            int s = S%60;
            int m = (S/60)%60;
            int h = (S/60)/60;
            System.out.println(h + ":" + m + ":" +s );
        }
    }
}

