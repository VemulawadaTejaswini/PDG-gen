import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String f = sc.nextLine();
		if(f.substring(f.length() - 1, f.length()).equals("s")){
			System.out.println(f + "es");
		}else{
			System.out.println(f + "s");
		}
		
		
		
	}
}