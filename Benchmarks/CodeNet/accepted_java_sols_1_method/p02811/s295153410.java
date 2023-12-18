import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    int K=scan.nextInt();
    int X=scan.nextInt();
    int N=500*K;
    
    if(N>=X){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}