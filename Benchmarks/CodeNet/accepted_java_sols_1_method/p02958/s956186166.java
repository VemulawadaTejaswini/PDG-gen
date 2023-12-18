import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] p = new int[n];
    int counter = 0;
    boolean ans = true;
    for(int i = 0;i < n;i++){
      p[i] = sc.nextInt();
      if(p[i] != i + 1){
        counter++;
        if(counter == 3){
          ans = false;
          break;
        }
      } 
    }
    if(ans){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
