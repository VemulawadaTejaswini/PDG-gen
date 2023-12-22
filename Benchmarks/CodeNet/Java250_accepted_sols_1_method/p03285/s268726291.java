import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    for(int i = 0 ; i < 100 / 7 ; i++ ){
      for(int j = 0; j< 100/ 4 ; j++){
        if(N==(i*7) + (j*4)){
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
  }
}
      
           