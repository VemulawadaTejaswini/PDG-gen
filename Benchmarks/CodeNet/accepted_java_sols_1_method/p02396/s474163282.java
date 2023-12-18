import java.util.*;                                                                                  

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 10000; i++) {
          String line = sc.nextLine();
          int x = Integer.parseInt(line);

          if(x == 0) {
            break;
          }   

          System.out.println("Case " + i + ": " + x); 
        }   
    }   
}