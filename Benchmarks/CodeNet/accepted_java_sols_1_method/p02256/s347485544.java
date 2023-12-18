import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int xx = 0, yy = 0;

        while(y != 0){
        if(x <= y){
            int t = x;
            x = y;
            y = t;
        }

        xx = y;
        yy = x % y;

        x = xx;
        y = yy;
        }
        
        System.out.println(xx);

        sc.close();
    }
}
