import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    StringBuilder sb = new StringBuilder();
    sb.append("Christmas");
    for(int i = 0; i < 25 - D; i++){
      sb.append(" Eve");
    }
    System.out.println(sb.toString());
  }
}