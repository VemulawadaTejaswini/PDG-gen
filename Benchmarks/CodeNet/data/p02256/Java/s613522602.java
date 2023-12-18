import java.util.Scanner;

public class Main{

    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b ,a % b);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a ,b ,x;
        a = sc.nextInt();
        b = sc.nextInt();

        x = gcd(a ,b);

        System.out.printf("%d\n",x);
    }
}
