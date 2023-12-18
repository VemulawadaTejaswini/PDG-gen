import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s;
    int sum;
    while (!(s = sc.next()).equals("0")){
      sum = 0;
      for(int i = 0;i < s.length();i++){
        sum += Integer.parseInt(String.valueOf(s.charAt(i)));
      }
      System.out.println(sum);
    }
  }
}

