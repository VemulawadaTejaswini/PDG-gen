import java.util.Scanner;
 
public class Main {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
     
      for(int i=0; i<1000; i++) {
        int cal = 1000 * i - N;
        if(cal >= 0) {
          System.out.println(cal);
          break;
        } else {
          continue;
        }
      }
   }
}