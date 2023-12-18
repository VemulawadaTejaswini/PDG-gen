import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int Age = sc.nextInt();
    int Fee = sc.nextInt();
    
    if(Age<6){
    	Fee=0;
    }else if(Age<13){
      Fee=Fee/2;
    }
    System.out.println(Fee);
  }
}
