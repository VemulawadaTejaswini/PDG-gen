import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    Integer ft = Integer.parseInt(input.substring(0,2));
    Integer rest = Integer.parseInt(input.substring(2,4));
    
    String result = "NA";
    
    boolean isFtAvaMon = ft >= 1 && ft <= 12;
    boolean isRestAvaMon =  rest >= 1 && rest <= 12;
    
    if(isFtAvaMon && isRestAvaMon) {
        result = "AMBIGUOUS";
    } else if(!isFtAvaMon && isRestAvaMon) {
        result = "YYMM";
    } else if(isFtAvaMon && !isRestAvaMon) {
        result = "MMYY";
    }
    
    System.out.println(result);
  }
}