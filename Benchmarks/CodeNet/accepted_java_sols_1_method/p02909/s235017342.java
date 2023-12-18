import java.util.*;
import java.lang.*;



public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String today = sc.next();
        if(today.equals("Sunny")) System.out.println("Cloudy");
        if(today.equals("Cloudy")) System.out.println("Rainy");
        if(today.equals("Rainy")) System.out.println("Sunny");

    }
}
