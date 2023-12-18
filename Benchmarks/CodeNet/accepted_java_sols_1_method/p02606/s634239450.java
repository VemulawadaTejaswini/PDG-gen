import java.util.*;



public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int l = scanner.nextInt();
    int r = scanner.nextInt();
    int d = scanner.nextInt();
    int ans = 0;

    for(int i = l; i <= r; i++){
      if(i % d ==0){
        ans++;
      }
    }
    


    System.out.println(ans);
    
    scanner.close();
    return;
  }
  
}
