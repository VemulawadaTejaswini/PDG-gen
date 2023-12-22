import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		//文字数
		int N=sc.nextInt();
		String nyuryoku=sc.next();
		
		String[] slimOrder=nyuryoku.split("");
		int elementsCnt=slimOrder.length;
	
		for(int i=1;i<slimOrder.length;i++) {
			if(slimOrder[i-1].equals(slimOrder[i])) {
				elementsCnt=elementsCnt-1;
			}
		}
		
		System.out.println(elementsCnt);
	}

}
