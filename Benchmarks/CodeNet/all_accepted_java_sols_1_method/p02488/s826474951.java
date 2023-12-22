import java.util.Scanner;


public class Main{

	public static void main(String[] args){

		//単語の数
		int n;

		//入力


		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		String str[] = new String[n];

		for(int i=0; i < n; i++){

			str[i] = sc.next();
		}
		//compareTo():2つの文字列を辞書的に比較

		String min = str[0];

		for (int i = 1; i < n; i++)
		{
			if(str[i].compareTo(min) < 0){

				min = str[i];
			}
		}
		System.out.println(min);

	}



}