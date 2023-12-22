import java.util.Scanner;
 
class Main {
  public static void main(String args[ ]) {
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  if (n < 1000){
    System.out.print("ABC");
  }else{
     System.out.print("ABD");
  }
  }
}