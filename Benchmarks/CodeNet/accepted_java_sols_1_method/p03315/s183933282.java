import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int n = 0;

    for(int i = 0; i<4; i++){
      if(S.charAt(i) == '+'){
        n++; //入力された文字列の先頭からi番目の文字が'+'ならnの値を1増やす(先頭は0番目と見做すことに注意)
      }else{
        n--; //'+'でなければnの値を1減らす
      }
    }
    System.out.println(n);
  }
}
