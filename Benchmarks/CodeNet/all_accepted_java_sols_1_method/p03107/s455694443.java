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
		char[]cube=sc.next().toCharArray();
		sc.close();

		int zero=0;
		int ichi=0;
		for(int i=0;i<cube.length;i++){
			if(cube[i]=='0'){
				zero++;

			}else{
				ichi++;
			}
		}

		int ans=Math.min(zero, ichi);
		System.out.println(ans*2);
		/*
		int ans=Math.min(zero, ichi);
		System.out.println(ans*2);
*/
	}



}
