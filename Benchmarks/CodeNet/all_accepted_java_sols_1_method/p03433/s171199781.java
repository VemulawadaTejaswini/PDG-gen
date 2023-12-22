import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();
    int miniCoin = sc.nextInt();
    
    if(target%500 <= miniCoin){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    }
}
