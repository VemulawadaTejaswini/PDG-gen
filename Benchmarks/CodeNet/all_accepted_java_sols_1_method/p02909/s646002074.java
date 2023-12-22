import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String Sunny = "Sunny", Cloudy = "Cloudy", Rainy = "Rainy";
        if(st.equals(Sunny)){
            System.out.print("Cloudy");
        }else if(st.equals(Cloudy)){
            System.out.print("Rainy");
        }else{
            System.out.print("Sunny");
        }
    }
}