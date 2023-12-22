import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		String S = scan.next();
		
		
		if(S.length()%2==0){//文字列の長さが奇数か偶数で場合わけ
			for(int i = 0;i<S.length()-1;i=i+2){//偶数
				sb.append(S.substring(i, i+1));
				
			}
			
		}else{//奇数の時
			for(int i = 0;i<S.length();i=i+2){
				sb.append(S.substring(i, i+1));
			}
			
		}
		
		
		
		
		System.out.println(sb.toString());
		
	}

}
