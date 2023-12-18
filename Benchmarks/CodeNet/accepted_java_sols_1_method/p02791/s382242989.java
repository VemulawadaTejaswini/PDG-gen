import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // get value from StandardIn
    int n = Integer.parseInt(sc.next());
    int nextNum = 0;
    int minNum = Integer.parseInt(sc.next()); // 最小値格納
    int count = 1; // 最小値更新回数

    // 最小値以下を入力されたらインクリメント
    for(int i=0; i<n-1; i++){
      // System.out.println(i);
      nextNum = Integer.parseInt(sc.next());
      if(nextNum < minNum){
        minNum = nextNum;
        count++;
      }
    }

    // int b = Integer.parseInt(sc.next());
    // String ans = "";

    System.out.println(count);
  }
}
