import java.util.*;
public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int ramen = 700;
  String s = sc.next();
    for (int i = 0; i < s.length(); i++){
    if(s.charAt(i)=='o'){
      ramen += 100;
    }
    }
  System.out.println(ramen);
  }
}
