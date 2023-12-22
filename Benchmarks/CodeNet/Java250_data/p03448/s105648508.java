import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    int ans = 0;
    for (int i = 0; i < a+1; i++){
      for (int j = 0; j < b+1; j++){
        for (int k = 0; k < c+1; k++){
          int temp = 500*i + 100*j + 50*k;
          if (temp == x){ans += 1;}
        }
      }
    }
    System.out.println(ans);
    
  }
}
