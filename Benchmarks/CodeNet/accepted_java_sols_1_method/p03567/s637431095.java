import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String s=sc.next(); //入力された文字列
		int AC_exi=0;
		
		//ACが連続して含まれているか確認
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)=='A' && s.charAt(i+1)=='C') AC_exi=1;
		}
		//YesかNoを出力
		if(AC_exi==1) System.out.println("Yes");
		else System.out.println("No");
	}
} 