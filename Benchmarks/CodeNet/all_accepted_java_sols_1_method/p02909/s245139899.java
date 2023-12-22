import java.util.*;
 
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String weth = sc.nextLine();
      String out = null;
      if(weth.equals("Sunny")){
        out = "Cloudy";
      }else if(weth.equals("Cloudy")){
        out = "Rainy";
      }else{
        out = "Sunny";
      }
      System.out.println(out);
    }
}