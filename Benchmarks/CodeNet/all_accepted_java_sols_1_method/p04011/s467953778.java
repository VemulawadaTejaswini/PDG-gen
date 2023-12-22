import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//宿泊日数
        int k = sc.nextInt();
        int x = sc.nextInt();//n泊までの値段
        int y = sc.nextInt();//n+1泊以降の値段
        if(n > k){
            System.out.println( (k*x) + ((n-k)*y) );
        } else {
            System.out.println( n*x );
        }
    }
    
}
