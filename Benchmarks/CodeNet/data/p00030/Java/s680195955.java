
import java.util.Scanner;

public class Main {
    static int count = 0;
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);


        while(true){
            int n = scan.nextInt();
            int s = scan.nextInt();
            if(n == 0 && s == 0)break;
            count = 0;
            sum(n, s, 0, 0);
            System.out.println(count);
        }

        scan.close();
    }

    static void sum(int n ,int s, int w, int nsum){
        if(n == 1){
            for(int i = w;i <= 10-n;i++){
                if(i + nsum == s)count++;
            }
            return;
        }
        for(int i = w;i <= 10-n;i++){
            nsum += i;
            sum(n-1, s, i+1, nsum);
            nsum -= i;
        }
    }
}
