import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String inputStr=sc.nextLine();
		char[] aStr=new char[inputStr.length()];
		int i = 0;
		for(int j = 0;j < inputStr.length();j++){
			aStr[j]=inputStr.charAt(j);
			if(aStr[j] == '+'){
				i = i + 1;
			}else{
				i = i - 1;
			}
		}
		// 出力
		System.out.println(i);
	}
}