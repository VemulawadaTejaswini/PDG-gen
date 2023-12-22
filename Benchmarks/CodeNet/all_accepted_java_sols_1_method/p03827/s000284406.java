import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();	//文字列の長さ
		String S=sc.next();	//文字列
		int x=0,x_max=0;

		for(int i=0;i<N;i++){
			if(S.charAt(i)=='I') x++;
			else if(S.charAt(i)=='D') x--;
			if(x>x_max) x_max=x;
		}

		System.out.println(x_max);
	}
} 