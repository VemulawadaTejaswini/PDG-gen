import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
  	int mod = N % 500;
    if (mod <= A) System.out.println("Yes");
    else System.out.println("No");
  }
 }