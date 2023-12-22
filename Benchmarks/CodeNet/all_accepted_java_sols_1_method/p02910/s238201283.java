import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] tap = sc.nextLine().toCharArray();
    int len = tap.length;
    boolean flg = true;
    for(int i = 0; i < len; i++){
      if(i % 2 == 0){
        if(tap[i] == 'L'){
          flg = false;
      	}
      }
      else{
        if(tap[i] == 'R'){
          flg = false;
      	}
      }
    }
    
    if(flg){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}