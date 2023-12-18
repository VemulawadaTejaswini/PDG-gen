import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int cat = sc.nextInt();
    int mix = sc.nextInt();
    int result = sc.nextInt();
    
    if(cat > result){
      System.out.println("NO");
    
    }else if(cat + mix < result){
      System.out.println("NO");
      
    }else{
      System.out.println("YES");
    }
  }
}
