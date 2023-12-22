
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		boolean[]s = new boolean[31];
		for(int i=0;i<28;i++){
			s[sc.nextInt()]=true;
		}
		for(int i=1;i<31;i++){
			if(!s[i]){
				System.out.println(i);
			}
		}
	}

}