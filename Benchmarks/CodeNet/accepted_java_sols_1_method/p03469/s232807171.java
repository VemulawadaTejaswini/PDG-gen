import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String target = sc.next();
    String md = target.substring(4);
    System.out.println("2018" + md);
    }
}