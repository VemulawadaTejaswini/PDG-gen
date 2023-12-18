import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
      	
      	if (s.equals("Sunny")) {
          System.out.print("Cloudy");
        } else if (s.equals("Cloudy")) {
          System.out.print("Rainy");
        } else {
          System.out.print("Sunny");
        }       
    }
}