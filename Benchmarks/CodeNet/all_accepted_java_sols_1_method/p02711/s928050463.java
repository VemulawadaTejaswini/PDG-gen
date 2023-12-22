import java.util.Scanner;
class Main{
  public static void main(String args[]){
    String n;
    Scanner sc = new Scanner(System.in);
    n = sc.next();
    if(n.contains("7")){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
