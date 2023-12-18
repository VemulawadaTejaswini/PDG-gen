import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String 
				input,
				output = "";
		
	//入力
		input = sc.nextLine();
		
	//文字変換
		//String型をchar型へ変換
		char[] c = new char[input.length()];
		c = input.toCharArray();
		
		for(int i = 0;i < c.length;i++){
			//1文字ずつ大文字変換された文字と比較
			if(c[i] == Character.toUpperCase(c[i])){
				output += Character.toLowerCase(c[i]);
			}else{
				output += Character.toUpperCase(c[i]);
			}
		}
		
	//出力
		System.out.println(output);
		
	}
}

