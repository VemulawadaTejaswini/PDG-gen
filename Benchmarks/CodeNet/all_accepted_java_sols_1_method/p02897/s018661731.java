import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
    int oddCnt = 0;
    
    for(int i = 1; i <= num ; i++){
      if(i % 2 != 0){
        oddCnt++;
      }
    }
    System.out.println((double)oddCnt/num);
  }
}