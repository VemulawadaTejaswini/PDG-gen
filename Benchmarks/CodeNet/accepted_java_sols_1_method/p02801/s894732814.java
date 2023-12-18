import java.util.Scanner;
	public class Main{
      public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //文字の入力をし0番目を指定する
        char c = sc.next().charAt(0);
        //文字コード+1をして文字を表示させる
        System.out.println((char)(c+1));
      }
    }