import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    byte n = sc.nextByte();
    byte m = sc.nextByte();
    if(n==m){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
  
}