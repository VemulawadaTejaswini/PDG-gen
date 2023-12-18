import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力

		String s = sc.next();
		String t = sc.next();
				// 判定
		if(t.matches(s + ".")){
			System.out.print("YES");
  		}else{
			System.out.print("NO");
		}
	}
}
