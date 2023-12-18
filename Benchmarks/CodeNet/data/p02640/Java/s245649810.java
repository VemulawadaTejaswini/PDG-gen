import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner sc=new Scanner(System.in);
int X=sc.nextInt();
int Y=sc.nextInt();
for(int i=0;i<=X;i++)
	{
	if(i*2+(X-i)*4==Y)
	{
		System.out.println("yes");
		return;
	}

	}
System.out.println("No");


	}

}
