import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    String n_sinsu = Integer.toString(n,k);

    System.out.println(n_sinsu.length());

/*  以下のコードを書いたが、NumberFormatExceptionが発生した
    int n_sinsu = Integer.parseInt(Integer.toString(n,k));
    String ans = String.valueOf(n_sinsu);

    System.out.println(ans.length);
*/
  }
}
