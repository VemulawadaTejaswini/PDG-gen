import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner inp = new Scanner(System.in);
    String s = inp.next();
    char c = s.charAt(0);
    int f=0;
    for(int i=1;i<s.length();i++){
      if(c!=s.charAt(i)){
        f = 1;
      }
    }

    if(f==1){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}