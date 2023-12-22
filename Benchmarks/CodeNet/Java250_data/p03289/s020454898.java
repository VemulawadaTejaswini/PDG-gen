import java.util.*;

class Main{
  public static boolean test(String test){
    int c = 0;
    for(int i = 0;i < test.length();i++){

      if(i == 0 ){
        if(test.charAt(i) == 'A'){
          continue;
        }else{
          return false;
        }
      }
      if(i >= 2 && i <= test.length() - 2){
        if(test.charAt(i) == 'C'){
          c++;
          if(c>1){
            return false;
          }
          continue;
        }
      }
      if(Character.isUpperCase(test.charAt(i))){
        return false;
      }
  }
  if(c == 0){
  return false;
}
  return true;
}
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    if(test(a)){
      System.out.println("AC");
    }else{
      System.out.println("WA");
    }
  }
}