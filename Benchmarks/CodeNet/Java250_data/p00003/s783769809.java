import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	private static boolean isTriangle(int a,int b,int c)
	{
		int[] edge={a,b,c};
		Arrays.sort(edge);
		return edge[0]*edge[0]+edge[1]*edge[1]==edge[2]*edge[2];
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int a,b,c;
		for(int i=0;i<N;i++){
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			if(isTriangle(a,b,c)){
				System.out.println("YES");
			}else{
				System.out.println("NO");				
			}
		}
		scan.close();
	}
}