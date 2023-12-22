import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String[] list = sc.next().split("");
    
    for(int i = 0; i < Math.pow(2, list.length - 1); i++) {
      int total = Integer.parseInt(list[0]);
      StringBuilder answer = new StringBuilder(list[0]);
      for(int j = 0; j < list.length - 1; j++) {
        
        if((1&i>>j) == 1) {
          total += Integer.parseInt(list[j + 1]);
          answer.append("+").append(list[j + 1]);
        } else {
          total -= Integer.parseInt(list[j + 1]);
          answer.append("-").append(list[j + 1]);
        }
      }
      if(total == 7) {
        System.out.println(answer.append("=7").toString());
        break;
      }
    }  
  }
}