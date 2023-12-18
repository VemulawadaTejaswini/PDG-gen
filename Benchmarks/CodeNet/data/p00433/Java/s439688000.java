import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int sum[]=new int[2];
	for(int i=0;i<2;i++)
	    {
		int info,math,sci,eng;
		info=scan.nextInt();
		math=scan.nextInt();
		sci=scan.nextInt();
		eng=scan.nextInt();
		sum[i]+=info+math+sci+eng;
	    }
	if(sum[0]>sum[1] || sum[0]==sum[1])System.out.println(sum[0]);
	else if(sum[0]<sum[1])System.out.println(sum[1]);
	
    }
}