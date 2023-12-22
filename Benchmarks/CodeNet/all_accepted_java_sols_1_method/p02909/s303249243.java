import java.util.Scanner;
//import java.util.Map;
//import java.util.HashMap;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] map = {"Sunny", "Cloudy", "Rainy"};
    
 	String s = sc.next();

    int i = 0;
    for ( i = 0; i < map.length; i++) {
      if (map[i].equals(s)) {
        break;
      }
    }
    
    String result = "";
    if (i < map.length) {
      result = map[ (i+1) % map.length ];
    }
     
    System.out.println(result);
  }
}

