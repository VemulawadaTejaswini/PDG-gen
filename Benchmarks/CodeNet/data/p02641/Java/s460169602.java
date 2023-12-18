import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int n=sc.nextInt();
int p[]=new int[n];
int dif,ans=-1,ans_dif,che;
ans_dif=-1-x;
if(ans_dif<0)
{ans_dif=-ans_dif;}
for(int i=0;i<n;i++)
{

p[i]=sc.nextInt();	
}

for(int i=-1;i<=100;i++)
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