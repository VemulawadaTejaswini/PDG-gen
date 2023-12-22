import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();
    boolean ans = true;
    for(int i = 0;i < 3;i++){
      if(s[i] == s[i+1])  ans = false;
    }
    if(ans){
      System.out.println("Good");
    }else{
      System.out.println("Bad");
    }
  }
}
