import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    String b = a+"";
    for(int i=0; i<3; i++){
      if (b.charAt(i) == '7'){
        System.out.println("Yes");
        return;
      }
    } 
    System.out.println("No");
    
  }
}
