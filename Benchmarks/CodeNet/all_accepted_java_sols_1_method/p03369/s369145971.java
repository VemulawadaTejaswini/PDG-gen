import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int price = 700;
        String order = sc.next();
        if(order.substring(0,1).equals("o")) {
            price +=100;
        }
        if(order.substring(1,2).equals("o")) {
            price +=100;
        }
        if(order.substring(2,3).equals("o") ){
            price +=100;
        }
        
        System.out.println(price);
    }
}