import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//入力Nを取得
		String inputStrN=sc.nextLine();
		int inputIntN = Integer.parseInt(inputStrN);
		char[] aStrN=new char[inputStrN.length()];
		int sumN = 0;
		//S(N)を計算
		for(int j = 0;j < inputStrN.length();j++){
			aStrN[j]=inputStrN.charAt(j);
			sumN = sumN + Character.getNumericValue(aStrN[j]);
		}
		//判定
		if(inputIntN % sumN == 0){
			// 出力
			System.out.println("Yes");
		}else{
			// 出力
			System.out.println("No");
		}
		

	}
}