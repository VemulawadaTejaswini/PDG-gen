import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String target = scan.next();
    for(int i = 0; i < target.length() - 1; i++){
      if(target.charAt(i) == target.charAt(i+1)){
        System.out.println("Bad");
        return;
      } 
    }
    System.out.println("Good");
  }
}