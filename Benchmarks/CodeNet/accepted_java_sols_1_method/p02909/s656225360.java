import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if(line.equals("Sunny"))    System.out.println("Cloudy");
        else if(line.equals("Cloudy"))  System.out.println("Rainy");
        else    System.out.println("Sunny");
    }
}