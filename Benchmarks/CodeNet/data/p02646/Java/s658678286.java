import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int v=sc.nextInt();
		int b=sc.nextInt();
		int w=sc.nextInt();
		int t=sc.nextInt();
		int dis=a-b;
		if(dis<0)
		{dis=-dis;}
if(a!=b&&(w>v||t==0))
{
	System.out.println("NO");
	return;
}

if(dis<(v-w)*t)
{
				System.out.println("YES");
				return;
}
				else
		System.out.println("NO");

	}

}
