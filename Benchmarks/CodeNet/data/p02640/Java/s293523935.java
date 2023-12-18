import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();
    
    boolean j = true;

    for(int i = 0 ; i < x ; ++i){
      if(y%4==0){
        y /= 4;
      }else if(y%2==0){
        y /= 2;
      }else{
        j = false;
        break;
      }
    }
    
    if(j || y==1){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

  }
}