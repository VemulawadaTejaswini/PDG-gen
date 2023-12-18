import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        
        if(price < 1000) {
            System.out.println(1000 - price);
        } else {
            int surplus = price % 1000;
            int change  = 1000 - surplus;
            System.out.println(change);
        }
    }
}