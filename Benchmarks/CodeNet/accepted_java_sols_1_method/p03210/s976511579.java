import java.util.Scanner;

class Main{
  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    //入力の受け取り
    int x = scanner.nextInt();
    //xが 3 OR 5 OR 7なら
    if(x == 3 || x == 5 || x == 7){
      System.out.println("YES");
    //そうでなければ
    }else{
      System.out.println("NO");
    }
  }
}