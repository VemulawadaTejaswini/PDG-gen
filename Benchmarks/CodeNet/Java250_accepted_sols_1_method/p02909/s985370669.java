import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner yomi = new Scanner(System.in);
        String n =yomi.next();
        if (n.equals("Sunny")){
            System.out.println("Cloudy");
        }else if (n.equals("Cloudy")){
            System.out.println("Rainy");
        }else if (n.equals("Rainy")){
            System.out.println("Sunny");
        }

    }
}
