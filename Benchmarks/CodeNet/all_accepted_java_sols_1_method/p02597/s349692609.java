import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String line = sc.next();
    int red = 0;
    for(int i = 0;i < num;i++){
      if(String.valueOf(line.charAt(i)).equals("R")){
        red++;
      }
    }
    int change = 0;
    for(int i = 0;i < red;i++){
      if(String.valueOf(line.charAt(i)).equals("W")){
        change++;
      }
    }
    System.out.println(change);
  }
}