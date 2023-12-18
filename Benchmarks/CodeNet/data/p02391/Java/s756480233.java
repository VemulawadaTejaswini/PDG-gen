public class Main{
	
	public static void main(String[] args){
		
		//テキスト入力クラス
		Scanner sc = new Scanner(System.in);
		
		//入力された値を取ってくる
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		//入力された値を並び替え、大きいほうと小さいほうに分ける
		int big = 0;
		int small = 0;
		
		//最初の入力値が、２番目の入力値以下だった場合
		if(first >= second){
			big = first;
			small = second;
		//逆だった場合
		}else{			
			big = second;
			small = first;			
		}
		
		System.out.println(big+" "+small);	
	}
}