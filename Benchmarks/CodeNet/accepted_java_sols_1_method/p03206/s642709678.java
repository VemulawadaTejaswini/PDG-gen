import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//入力
		int D = sc.nextInt();
		//変数
		String answer="";
		//処理
		if(D==25)
		{
			answer="Christmas";
		}else if(D==24)
		{
			answer="Christmas Eve";
		}else if(D==23)
		{
			answer="Christmas Eve Eve";
		}else if(D==22)
		{
			answer="Christmas Eve Eve Eve";
		}
		// 出力
		System.out.println(answer);
	}
}