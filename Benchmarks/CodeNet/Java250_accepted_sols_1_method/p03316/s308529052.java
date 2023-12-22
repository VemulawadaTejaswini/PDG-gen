import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    int ans = 0;
    String[]b = a.split("");
    for(int i = 0; i < b.length; i++){
      ans = ans + Integer.parseInt(b[i]);
    }
    if(Integer.parseInt(a) % ans == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
    