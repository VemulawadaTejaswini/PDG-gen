import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num=scanner.nextInt();
    
    if(num >= 30) System.out.print("Yes");
    else System.out.print("No");
  }
}