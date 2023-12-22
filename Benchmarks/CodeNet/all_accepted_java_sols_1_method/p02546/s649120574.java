import java.util.*;

public class Main{ //クラス名はMain
    public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			// 文字列の入力
			String s = sc.next();
			
			/*--------------------------------*/
			//入力
			//String s = "bus";

			int p = s.length();

			String ans = s.substring(p-1,p);

			if("s".equals(ans)){
				s +="es";
			}else{
				s += "s";
			}
			System.out.println(s);
    }
}

