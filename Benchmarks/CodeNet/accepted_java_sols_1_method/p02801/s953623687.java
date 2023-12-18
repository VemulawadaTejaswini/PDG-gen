import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    String s = "abcdefghijklmnopqrstuvwxyz";
    String j = "";
    for(int i=0; i<25; i++){
      if(n.equals(s.substring(i,i+1))){
        System.out.println(s.substring(i+1,i+2));
        return;
      }
    }
    
    return;
  }
}
