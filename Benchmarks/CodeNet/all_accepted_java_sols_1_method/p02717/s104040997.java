import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A =  sc.nextInt();
    int B =  sc.nextInt();
    int C =  sc.nextInt();
    int work = 0;
    
    //AとBを入れ替え
    work = A;
    A = B;
    B = work;
    
    //AとCを入れ替え
    work = A;
    A = C;
    C = work;
    
    System.out.println(A + " " + B + " " + C);
  }
}