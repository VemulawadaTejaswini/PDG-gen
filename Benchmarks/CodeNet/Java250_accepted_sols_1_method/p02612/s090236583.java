import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        
        if(1000 >= price) {
            System.out.println(1000 - price);
        } else {
            int surplus = price % 1000;
            int change  = 0;
            if(0 != surplus) {
                change = 1000 - surplus;
            }
            System.out.println(change);
        }
    }
}