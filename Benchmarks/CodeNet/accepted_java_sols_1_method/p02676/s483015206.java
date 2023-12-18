import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    String S = sc.next(); 
    if (x >= S.length()){
      System.out.println(S);
    }else{
      System.out.println(S.substring(0,x)+"...");
    }
  }
}
