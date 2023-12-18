import java.util.*;
 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String strA = String.valueOf(a);
    String strB = String.valueOf(b);
    int c = Integer.parseInt(strA + strB);
    
    boolean isSquare = false;
    for(int i=1;i<=400;i++){
      if(i*i==c){
        isSquare = true;
        break;
      }else if(i*i>c){
        break;
      }
    }
    if(isSquare){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}