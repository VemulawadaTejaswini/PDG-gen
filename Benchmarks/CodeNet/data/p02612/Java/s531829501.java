import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        
        if(price < 1000) {
            System.out.println(price);
        } else {
            System.out.println(price % 1000);
        }
    }
}