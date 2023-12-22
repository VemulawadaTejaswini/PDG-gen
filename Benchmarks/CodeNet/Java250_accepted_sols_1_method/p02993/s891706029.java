import java.util.Scanner;

/**
 * @author yoshida3203
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		char[]S=sc.next().toCharArray();

		String ans="";
		for(int i=1;i<S.length;i++){
			if(S[i-1]==S[i]){
				ans="Bad";
				break;
			}else{
				ans="Good";
			}

		}

		System.out.println(ans);

	}
}
