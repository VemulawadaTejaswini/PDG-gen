import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int H=sc.nextInt();	//縦
		int W=sc.nextInt();	//横
		String s[]=new String[H];
		for(int i=0;i<H;i++) s[i] = sc.next();	//文字列を配列に格納

		for(int i=0;i<H;i++){
			System.out.println(s[i]);
			System.out.println(s[i]);
		}
	}
} 