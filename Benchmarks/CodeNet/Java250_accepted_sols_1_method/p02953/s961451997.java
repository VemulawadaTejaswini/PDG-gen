import java.util.*;
 
public class Main {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int H[] = new int[N];
    int Max = 0;
    
    for (int i = 0; i < N; i++){
      H[i] = scan.nextInt();
    }
    
    for (int i = 0; i < N; i++){
      if(H[i]-1 > Max){
        Max = H[i]-1;
      } else if(H[i] < Max){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}