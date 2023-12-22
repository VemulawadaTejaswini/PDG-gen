import java.util.Scanner;
public class Main{
  // TODO 自動生成されたメソッド・スタブ
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    String s = String.valueOf(i);
    String[] ss = s.split("");
    int count = 0;
    for(String masu : ss){
      if(masu.equals("1")) {
        count = count + 1;
      }
    }
    System.out.println(count);
    }
}