import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>difficulty=new ArrayList<>();
		
		//問題数
		int N=sc.nextInt();
		
		int halfLine;
		
		//問題の難易度
		for(int i=0;i<N;i++) {
			difficulty.add(sc.nextInt());
		}
		
		Collections.sort(difficulty);	
		halfLine=difficulty.size()/2;
	
		int result=
				difficulty.get(halfLine)-difficulty.get(halfLine-1);
		
		
		System.out.println(result);
	}
 
}