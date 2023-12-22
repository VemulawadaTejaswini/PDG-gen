import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.printf("%f ",((double)W*(double)H)/2);
        if(2*x==W && 2*y==H) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        
    }
}