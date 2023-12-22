import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int price = b * 10; price < (b + 1) * 10; price++){
            if(price * 8 / 100 == a && price * 10 / 100 == b){
                System.out.println(price);
                return;
            }
        }
        System.out.println(-1);
    }
}