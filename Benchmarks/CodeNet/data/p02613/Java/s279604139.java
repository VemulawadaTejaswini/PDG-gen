import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = 0;
		int c = 0;
		int e = 0;
		int f = 0;
		// スペース区切りの整数の入力
		// 文字列の入力
		String[] d = new String[a];
		for(int i = 0; i < a ; i++){
			d[i] = sc.nextLine();
		} 
		for(int i = 0; i < a; i++){
			if(d[i].equals("AC")){
				b++;
			}
			if(d[i].equals("WA")){
				c++;
			}
			if(d[i].equals("TLE")){
				e++;
			}
			if(d[i].equals("RE")){
				f++;
			}
		}
		System.out.println("AC × " + b);
		System.out.println("WA × " + c);
		System.out.println("TLE × " + e);
		System.out.println("RE × " + f);
		
		
		
	}
}