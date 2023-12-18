import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    String today = sc.next();
    String tomorrow = null;
    switch (today) {
	case "Sunny":
		tomorrow = "Cloudy";
		break;
	case "Cloudy":
		tomorrow = "Rainy";
		break;
	case "Rainy":
		tomorrow = "Sunny";
		break;
    }
    
    System.out.println(tomorrow);
    
  }
}