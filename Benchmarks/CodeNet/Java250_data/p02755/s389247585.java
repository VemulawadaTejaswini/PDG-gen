import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double x = a * 12.5;
        double y = x + 11.25;
        int m = b * 10;
        int n = m + 9;
        int r;
        if(x <= m && m < y){
            r = m;
        }else if(m <= x && x < n){
            if((int)x == x){
                r = (int)x;
            }else {
                r = (int) (x + 1);
            }
        }else{
            r = -1;
        }
        System.out.println(r);
    }
}