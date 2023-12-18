import java.util.*;

class Main{
  public static boolean isPalindrome(String str){
    for(int i = 0; i < (int)Math.ceil(0.5*str.length()); i++) {
      if (str.charAt(i) != str.charAt(str.length()-1-i)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int counter = 0;
    while(sc.hasNext()) {
      String str = sc.next();
      if (isPalindrome(str)) {
        counter++;
      }
    }
    System.out.println(counter);
  }
}