import java.util.Scanner;

public class Main
{
	private static void swap(int r[],int a,int b)
	{
		int tmp=r[a];
		r[a]=r[b];
		r[b]=tmp;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int w=scan.nextInt();
		int n=scan.nextInt();
		int a,b;
		int[] r=new int[w];
		for(int i=0;i<r.length;i++){
			r[i]=i+1;
		}
		for(int i=0;i<n;i++){
			String[] tmp=scan.next().split(",");
			a=Integer.parseInt(tmp[0]);
			b=Integer.parseInt(tmp[1]);
			swap(r,a-1,b-1);
		}
		for(int i=0;i<r.length;i++){
			System.out.println(r[i]);
		}
		scan.close();
	}
}