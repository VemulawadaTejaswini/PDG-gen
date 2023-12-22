import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    boolean flag = false;
    
    for(int i = 1; i < b * a; i++){
      if((i * a - c) % b == 0){
        flag = true;
        break;
      }
    }
    
    if(flag){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}