import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	//宣言
		int
				sum;
		String
				input,
				output = "";
		
	//入力
		input = sc.next();
		//終了判定
		while(!(input.equals("0"))){
			sum = 0;
			for(int i = 0;i < input.length();i++){
				//文字列のi番目の文字を数値として合計に加算
				sum += Character.getNumericValue(input.charAt(i));
			}
			output += sum + "\n";
			input = sc.next();
			
		}
		
	//出力
		System.out.println(output.substring(0, output.length()-1));
		
	}
}

