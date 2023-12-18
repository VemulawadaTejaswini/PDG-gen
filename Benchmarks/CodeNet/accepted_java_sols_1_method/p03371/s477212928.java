import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        long sum = 0;
        if((a+b)/2 >= c){
            if(x == y){
                sum = x * 2 *c;
            } else if (x > y) {
                sum += y * 2*c;
                x = x-y;
                if(a > c * 2){
                    sum += x * 2 * c;
                }else{
                    sum += x*a;
                }
            }else{
                sum += x * 2 *c;
                y = y-x;
                if(b > c*2){
                    sum += y * 2* c;
                }else{
                    sum += y*b;
                }
            }
        }else{
            sum = a*x + b*y;
        }
        System.out.println(sum);

    }
}