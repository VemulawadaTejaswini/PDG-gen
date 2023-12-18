import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == 'R' && i%2==1){
        System.out.println("No");
        return;
      }else if(str.charAt(i) == 'L' && i%2==0){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
 }