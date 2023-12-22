import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(); //500
    int B = sc.nextInt(); //100
    int C = sc.nextInt();  //50
    int target = sc.nextInt(); //合計
    int pattern = 0;
    
    for(int i =0 ; i < A+1 ; i++){
      for(int j = 0 ; j < B+1 ; j++){
        for(int k = 0 ; k < C+1 ; k++){
          if((500 * i) + (100 * j) + (50 * k) == target){
            pattern++;
          }
        }
      }
    }
    System.out.println(pattern); 
  }
}
