import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == '7'){
        System.out.print("Yes");
        return;
      }
    }
    System.out.print("No");
  }
}