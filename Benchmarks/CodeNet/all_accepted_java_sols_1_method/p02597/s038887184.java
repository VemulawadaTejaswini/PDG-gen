import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    String str = scanner.next();
    int n_r  =0;
    int[] s = new int[n];
    int ans = 0;
    for(int i = 0; i< n; i++){
      if(str.charAt(i) == 'W'){
        s[i] = 0;
      }else{
        s[i] = 1;
        n_r += 1;
      }
    }

    for(int i = 0; i< n_r; i++){
      if(s[i] == 0){
        ans ++;
      }

    }
    System.out.println(ans);
   
    scanner.close();
    return;
  }
  
}
