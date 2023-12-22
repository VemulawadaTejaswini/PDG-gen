import java.util.Scanner;

public class  Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String s=sc.next(); //入力された文字列
		int C_exi=0;	//Cが存在する時1、しない時0
		int F_exi=0;	//Fが存在する時1、しない時0
		
		//Cが存在するか確認
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='C'){
				C_exi=1;	//Cが存在したらC_exiを1に
				for(int j=i;j<s.length();j++){
					if(s.charAt(j)=='F') F_exi=1;
				}
			}
		}

		if(F_exi==1) System.out.println("Yes");
		else System.out.println("No");
	}
} 