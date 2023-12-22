import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int flag = 0;
    for(int i = 0; i < s.length(); i++){
      if(i % 2 == 0){
        if(s.charAt(i) == 'L'){
          flag = 1;
          break;
        }
      }else{
        if(s.charAt(i) == 'R'){
          flag = 1;
          break;
        }
      }
    }
    if(flag == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}