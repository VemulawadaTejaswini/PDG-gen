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
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[]word=str.toCharArray();

		int sum=0;
		int max=0;
		for(char a:word){
			if(a=='A'||a=='C'||a=='G'||a=='T'){
				sum++;
				max=Math.max(max, sum);
			}else{
				sum=0;
			}
		}
		System.out.println(max);



	}

}
