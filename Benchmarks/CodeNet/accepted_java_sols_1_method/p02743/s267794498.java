import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    if(c>a+b&&4*a*b<(c-a-b)*(c-a-b)){
      System.out.print("Yes");
    } else {
      System.out.print("No");
    };
  }
}