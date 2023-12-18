import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		int h,w;
		h=scan.nextInt();
		w=scan.nextInt();
		if(h==0 && w==0)break;
		char t[][]=new char[h][w];
		int count[][]=new int[h][w];
		for(int i=0;i<h;i++)
		    {
			String str=scan.next();
			for(int j=0;j<w;j++)
			    {
				t[i][j]=str.charAt(j);
			    }
		    }
		int i=0,j=0;
		while(true)
		    {
		    if(t[i][j]=='>')
			{
			    count[i][j]++;
			    j++;
			}
		    else if(t[i][j]=='<')
			{
			    count[i][j]++;
			    j--;
			}
		    else if(t[i][j]=='^')
			{
			    count[i][j]++;
			    i--;
			}
		    else if(t[i][j]=='v')
			{
			    count[i][j]++;
			    i++;
			}
		    else if(t[i][j]=='.')
			{
			    System.out.println(j+" "+i);
			    break;
			}
		    if(count[i][j]==1)
			{
			    System.out.println("LOOP");
			    break;
			}
		    }
		
	    }
    }
}