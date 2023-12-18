import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int n=sc.nextInt();
int p[]=new int[n];
int dif,ans=0,ans_dif,che;
ans_dif=x;
for(int i=0;i<n;i++)
{

p[i]=sc.nextInt();
}

for(int i=1;i<=101;i++)
{
	dif=i-x;
	if(dif<0)
	{dif=-dif;}
	if(ans_dif>dif)
	{che=0;
		for(int j=0;j<n;j++)
		{
			if(i==p[j])
			{
				che=1;
			}
		}
		if(che==0)
		{
			ans=i;
			ans_dif=dif;
		}
	}
}
System.out.println(ans);
	}

}
