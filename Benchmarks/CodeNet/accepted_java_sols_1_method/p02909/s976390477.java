import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String hoge = sc.next();
        if(hoge.equals("Sunny")){
            System.out.println("Cloudy");
        }else if(hoge.equals("Cloudy")){
            System.out.println("Rainy");
        }else{
            System.out.println("Sunny");
        }
    }     
}