import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        ans += sc.nextInt();
        ans += sc.nextInt();
        ans += sc.nextInt();
        if(ans >= 22){
            System.out.println("bust");
            return;
        }else{
            System.out.println("win");
            return;
        }
    }
}