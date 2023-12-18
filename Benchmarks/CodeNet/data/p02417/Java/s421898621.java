//与えられた英文に含まれる、各アルファベットの数を数えるプログラムを作成して下さい。 なお、小文字と大文字は区別しません。
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    int [] count = new int[128];
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      String str = sc.nextLine().toLowerCase();
      for(int i=0;i<str.length();i++){
        count[str.charAt(i)]++;
      }
    }
    for(char c='a';c<='z';c++){
      System.out.printf("%c : %d\n",c,count[c]);
    }

  }
}

