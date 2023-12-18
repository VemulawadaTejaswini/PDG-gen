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
//		String str="ABCDE";
//		char[]a=str.toCharArray();
//		System.out.println(a);
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[]H=new int[N];

		for(int i=0;i<H.length;i++){

			H[i]=sc.nextInt();
	}
		sc.close();

		int ans=1;
		int max=H[0];

		for(int i=1;i<H.length;i++){
			if(max<=H[i]){
				max=H[i];
				ans++;
			}
		}System.out.println(ans);

	}
}