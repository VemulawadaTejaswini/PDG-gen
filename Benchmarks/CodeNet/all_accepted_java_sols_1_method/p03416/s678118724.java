import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for(int i = a; i <= b; i++){
      String str = String.valueOf(i);
      boolean flag = true;
      for(int j = 0; j < str.length() / 2; j++){
        if(str.charAt(j) != str.charAt(str.length() - 1 - j)){
          flag = false;
          break;
        }
      }
      if(flag){
        count++;
      }
    }
    System.out.println(count);
  }
}