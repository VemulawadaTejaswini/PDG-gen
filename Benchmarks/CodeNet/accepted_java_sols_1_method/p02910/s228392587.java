	import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int index,len, rem;
		String s,t,answer;
		
			// 整数の入力
		
		s = sc.next();
		sc.close();
		answer="Yes";
		len=s.length();
		LoopA: for(index=0;index<len;index++) {
			rem=index%2;
			if(rem==0) {
				if(s.substring(index,index+1).equals("R")) {
				}
				else if(s.substring(index,index+1).equals("U")) {
				}
				else if(s.substring(index,index+1).equals("D")) {
				}
				else {
					answer="No";
					break LoopA;
				}
			}	
			else {
				if(s.substring(index,index+1).equals("L")) {
				}
				else if(s.substring(index,index+1).equals("U")) {
				}
				else if(s.substring(index,index+1).equals("D")) {
				}
				else {
					answer="No";
					break LoopA;
				}
				
			}
		}
		System.out.print(answer);

			// 出力
 
	}
}	