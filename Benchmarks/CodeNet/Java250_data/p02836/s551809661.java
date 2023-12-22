import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
      //入力
      String s = sc.next();
      int length = s.length();
      char[] kaibun = s.toCharArray();
      int hug = 0;
      
      //回文になっていない文字を探す
      for(int i = 0; i <length/2; i++){
            if(kaibun[i]!=kaibun[length-1-i]){
            hug++;
            }
      }
       //ハグの最小回数を出力
      System.out.print(hug);
    }
}
   