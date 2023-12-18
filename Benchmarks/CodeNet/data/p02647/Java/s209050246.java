import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int K=sc.nextInt();
int A[]=new int[N];
int B[]=new int[N];

for(int i=0;i<N;i++)
{
 A[i]=sc.nextInt();
B[i]=0;
}
for(int l=0;l<K;l++)
{
for(int i=0;i<N;i++)
{
 for(int j=0;j<N;j++)
 {
	 if(i-A[i]-0.5<j && j < i+A[i]+0.5)
	 B[j]++;
 }
}
 for(int k=0;k<N;k++)
	{
		A[k]=B[k];
		B[k]=0;
	}

}
for(int k=0;k<N;k++)
{

System.out.println(	A[k]);
}
	}

}