import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String kakou = s.substring(s.length() - 1);
		if(kakou.equals("s")){
			// 出力
			System.out.println(s + "es");

		}else{
			System.out.println(s + "s");
		}
		
	}
}