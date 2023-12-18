import java.util.*;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String n = (String)sc.nextLine();
    
    int sum = 0;
    for(int i = 0; i < n.length();i++){
      sum += Character.getNumericValue(n.charAt(i));
    }

    if(sum % 9 == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}