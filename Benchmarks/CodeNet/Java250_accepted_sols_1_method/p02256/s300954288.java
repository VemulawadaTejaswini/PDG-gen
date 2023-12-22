import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = Math.max(x,y);
        int b = Math.min(x,y);
        while(!(a ==0 || b == 0)){
            a = a%b;
            if(a == 0){
                break;
            }
            b = b%a;
        }
        System.out.println(Math.max(a,b));
    }
}