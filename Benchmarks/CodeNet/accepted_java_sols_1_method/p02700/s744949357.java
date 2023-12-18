import java.util.*;
public class Main
{
	public static  void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String h[]=sc.nextLine().split(" ");
		int a=Integer.parseInt(h[0]);
		int b=Integer.parseInt(h[1]);
		int c=Integer.parseInt(h[2]);
		int d=Integer.parseInt(h[3]);
		int p=1;
		while(a>0 && c>0)
		{
			if(p==1){c-=b;}
			else{a-=d;}
			p=-p;
		}
		System.out.println(a>c?"Yes":"No");
	}
}