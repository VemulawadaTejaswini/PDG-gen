import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    String ans = "";
    String str = scn.next();
    char []c_str = str.toCharArray();
    for(int i = 0; i < 3; i++){
      ans += c_str[i];
    }
    System.out.print(ans);
  }
}