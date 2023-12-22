import java.util.*;


public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //文字列の長さ
      int n = sc.nextInt();
      //指定する文字の位置
      int k = sc.nextInt();
      sc.nextLine();
      
      //対象文字列
      String str = sc.nextLine();
      
      
      for(int i = 0;i < n;i++){
        if(i == k - 1){
          char c = str.charAt(i);
          String ans = String.valueOf(c);
          System.out.print(ans.toLowerCase());
        }else{
          System.out.print(str.charAt(i));
      }
      }
    }
}
