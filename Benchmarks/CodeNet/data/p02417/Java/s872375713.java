import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
	//宣言
				
		int[]
				alphabetCount = new int[26];
				
		String
				input;
		
	//入力
		input = sc.nextLine();
		//終了判定
		while(sc.hasNext()){
			char[] c = new char[input.length()];
			c = input.toLowerCase().toCharArray();
			for(int cNum = 0;cNum < c.length;cNum++){
				for(int aNum = 0;aNum < alphabetCount.length;aNum++){
					if((int)c[cNum] == aNum + 97){
						alphabetCount[aNum] += 1;
					}
				}
			}
			
			input = sc.nextLine();
		}
		
	//出力
		for(int aNum = 0;aNum < alphabetCount.length;aNum++){
			System.out.println((char)(aNum + 97) + " : " + alphabetCount[aNum]);
		}
	}
}

