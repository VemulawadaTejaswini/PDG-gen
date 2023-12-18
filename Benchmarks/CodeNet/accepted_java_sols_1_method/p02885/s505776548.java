import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int total = n - a*2;
    
    if(total > 0){
      System.out.println(total);
    }else{
      System.out.println(0);
    }
  }
}
