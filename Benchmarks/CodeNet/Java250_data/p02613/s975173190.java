import java.lang.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    HashMap<String,Integer> map = new HashMap<>();
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    while(scan.hasNextLine()){
      String val = scan.nextLine();
      if(map.get(val) == null) map.put(val, 1);
      else map.put(val, map.get(val)+1);
    }
    
    System.out.println("AC x " + ((map.get("AC") == null)? 0 : map.get("AC")));
    System.out.println("WA x " + ((map.get("WA") == null)? 0 : map.get("WA")));
    System.out.println("TLE x " + ((map.get("TLE") == null)? 0 : map.get("TLE")));
    System.out.println("RE x " + ((map.get("RE") == null)? 0 : map.get("RE")));
  }
}