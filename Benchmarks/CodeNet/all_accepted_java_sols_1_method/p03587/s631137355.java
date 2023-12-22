import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
	//	int a = sc.nextInt();
		// スペース区切りの整数の入力
	//	int b = sc.nextInt();
	//	int c = sc.nextInt();
		// 文字列の入力
		String s = sc.next();
		int len=s.length();
int sum=0;
		// 出力
		for(int i=0;i<len;i++){
		if(s.charAt(i)=='1')
		sum++;
		}
		
		System.out.println(sum);
	}
}