import java.util.*;
class Main {
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    B();
    
    
  }
  
  private static void A(){
    int n = sc.nextInt();
    int val = sc.nextInt();
    System.out.print((n*500 >= val)?"Yes":"No");
  }
  
  private static void B(){
    int n = Integer.parseInt(sc.nextLine());
    String str = sc.nextLine();
    
    int ans = 0;
    
    for (int i = 0; i < str.length() - 2; i++){
      if (str.charAt(i) == 'A'){
        if (str.charAt(i + 1) == 'B' && str.charAt(i + 2) == 'C') ans++;
      }
      
    }
 System.out.print(ans);

  }
  
 
}

