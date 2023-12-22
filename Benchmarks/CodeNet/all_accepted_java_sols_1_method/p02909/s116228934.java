import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        String st=tan.next();
        if(st.equals("Sunny"))
            System.out.println("Cloudy");
        else if(st.equals("Cloudy"))
            System.out.println("Rainy");
        else 
            System.out.println("Sunny");
    }
}
