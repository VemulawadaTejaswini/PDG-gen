import java.util.*;

public class Main {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      double str = Double.parseDouble((String)scan.next());
      int count=0;
      double total=100;
      
      while(true){
          total *= 1.01;
          total = Math.floor(total);
          count++;
          if(str <= total){
              break;
          }
      }
      
      System.out.println(count);
      scan.close();
    }
}