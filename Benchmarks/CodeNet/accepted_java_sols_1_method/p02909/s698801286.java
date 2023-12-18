import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if(n.equals("Sunny")){
            System.out.println("Cloudy");
        }else if (n.equals("Cloudy")){
            System.out.println("Rainy");
        }else {
            System.out.println("Sunny");
        }



    }
}
