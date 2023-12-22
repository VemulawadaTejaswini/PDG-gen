import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    boolean b = false;
    for(int i = 1; i<=9; i++){
      if(N%i==0){
        int temp = N/i;
        if(temp<=9&&temp>=1){
          b = true;
        }
      }
    }
    if(b){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
