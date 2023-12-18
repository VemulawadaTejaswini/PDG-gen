import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        while(sc.hasNext()){
          String str = sc.next();
          str = str.replaceAll("apple", "alefiuahreliuafhlkejhflahefliuahelfahlrkejfhkhiauerwhfalirhgliurahgliuhglkajhgrlajkhglrkjghalkrjghalurghli");
          str = str.replaceAll("peach", "apple");
          str = str.replaceAll("alefiuahreliuafhlkejhflahefliuahelfahlrkejfhkhiauerwhfalirhgliurahgliuhglkajhgrlajkhglrkjghalkrjghalurghli", "peach");
          System.out.print(str);
          if(sc.hasNext()){
            System.out.print(" ");
          }
        }
        System.out.println("");
      }
}