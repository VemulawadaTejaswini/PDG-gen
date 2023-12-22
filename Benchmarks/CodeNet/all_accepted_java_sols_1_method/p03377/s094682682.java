import java.util.Scanner;
class Main{
  public static void main(String args[]){
    int A;
    int B;
    int X;
    Scanner sc = new Scanner(System.in);
    A = sc.nextInt();
    B = sc.nextInt();
    X = sc.nextInt();
    if(X <= A + B && X >= A){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
    return ;
  }
}
