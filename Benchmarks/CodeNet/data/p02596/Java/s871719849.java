import java.util.*;



public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    int n = 0;
    for(int i =1 ; i <=k; i++){
      n = ((n  *10) % k + 7) % k;
      if(n == 0){
      System.out.println(i);
      scanner.close();
    return;
    }
      
    }
    
    System.out.println("-1");
    scanner.close();
    return;
  }
  
}
