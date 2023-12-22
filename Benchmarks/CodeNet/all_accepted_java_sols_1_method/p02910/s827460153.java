import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] str = s.split("");
    int length = str.length;
    
    boolean easiness = true;
    for(int i=0;i<length;i+=2) {
      if(str[i].equals("L")) {
        easiness = false;
        break;
      }
    }
    for(int i=1;i<length;i+=2) {
      if(str[i].equals("R")) {
        easiness = false;
        break;
      }
    }
    
    if(easiness) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}