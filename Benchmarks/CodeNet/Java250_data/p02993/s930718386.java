import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    boolean bl = false;
    for(int i = 0; i<3 ; i++){
      bl |= (str.charAt(i) == str.charAt(i+1));
    }
    if(bl){
      System.out.println("Bad");
    }else{
      System.out.println("Good");
    }
  }
}