import java.io.IOException;
import java.util.Scanner;
class Main
{

	public static void main(String[] args)throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt(),w=sc.nextInt();
		int [] al=new int [26];
		String[] a=new String[h];
		for(int i=0;i<h;i++)
		{
			a[i]=sc.next();
			for(int j=0;j<w;j++)
			{
				String buf=a[i].substring(j, j+1);
				char[] alp=buf.toCharArray();
				int cnt=0;
				char z='a';
				while(alp[0]!=z)
				{
					z++;cnt++;
				}
				al[cnt]++;
			}
		}

		int hh=h/2;int ww=w/2;int end=0;
		if(h%2==1&&w%2==1)
		{
			for(int x=0;end==0&&x<hh*ww;x++)
			{
				for(int i=0;i<26;i++)
				{
					if(al[i]>=4){al[i]-=4;break;}
					if(i==25){end=1;}
				}
			}
			for(int x=0;end==0&&x<hh+ww;x++)
			{
				for(int i=0;i<26;i++)
				{
					if(al[i]>=2){al[i]-=2;break;}
					if(i==25){end=1;}
				}
			}
		}

		if(h%2==0&&w%2==0)
		{
			for(int x=0;end==0&&x<hh*ww;x++)
			{
				for(int i=0;i<26;i++)
				{
					if(al[i]>=4){al[i]-=4;break;}
					if(i==25){end=1;}
				}
			}
		}


		if(h%2==1&&w%2==0)
		{
			for(int x=0;end==0&&x<hh*ww;x++)
			{
				for(int i=0;i<26;i++)
				{
					if(al[i]>=4){al[i]-=4;break;}
					if(i==25){end=1;}
				}
			}
			for(int x=0;end==0&&x<ww;x++)
			{
				for(int i=0;i<26;i++)
				{
					if(al[i]>=2){al[i]-=2;break;}
					if(i==25){end=1;}
				}
			}
		}

		if(h%2==0&&w%2==1)
		{
			for(int x=0;end==0&&x<hh*ww;x++)
			{
				for(int i=0;i<26;i++)
				{
					if(al[i]>=4){al[i]-=4;break;}
					if(i==25){end=1;}
				}
			}
			for(int x=0;end==0&&x<hh;x++)
			{
				for(int i=0;i<26;i++)
				{
					if(al[i]>=2){al[i]-=2;break;}
					if(i==25){end=1;}
				}
			}
		}


		if(end==0){System.out.println("Yes");}
		else{System.out.println("No");}
	}

}