import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();
      int a = 0;
      if (s.equals("SUN")){
        a = 7;
      }else if (s.equals("MON")){
        a = 6;
      }else if (s.equals("TUE")){
        a = 5;
      }else if (s.equals("WED")){
        a = 4;
      }else if (s.equals("THU")){
        a = 3;
      }else if (s.equals("FRI")){
        a = 2;
      }else{
        a = 1;
      }
		// 出力
		System.out.println(a);
	}
}