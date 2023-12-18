import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String so[] = s.split("");
    int count = 0;
    for(int i = 0;i < 3;i++){
      if(so[i].equals("o")){
        count++;
      }
    }
    System.out.println(700 + 100 * count);
  }
}