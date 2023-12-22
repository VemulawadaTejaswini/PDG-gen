public class Main{
  public static void main(String[] args){
 
    int R = new java.util.Scanner(System.in).nextInt();
    
    if ((0 <= R ) && (R < 1200)) {
      System.out.println("ABC");
    } else if ((1200 <= R) && (R < 2800)) {
      System.out.println("ARC");
    } else if ((2800 <= R) && (R <= 4208)) {
      System.out.println("AGC");  
    }
  }
}