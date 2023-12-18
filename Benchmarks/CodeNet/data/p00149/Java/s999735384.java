import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int s[][]=new int[4][2];
	for(int i=0;i<4;i++)
	    {
	double l,r;
	l=scan.nextDouble();
	r=scan.nextDouble();
	if(l>=1.1)s[0][0]++;
	if(r>=1.1)s[0][1]++;
	if(0.6<=l && l<1.1)s[1][0]++;
	if(0.6<=r && r<1.1)s[1][1]++;
	if(0.2<=l && l<0.6)s[2][0]++;
	if(0.2<=r && r<0.6)s[2][1]++;
	if(l<0.2)s[3][0]++;
	if(r<0.2)s[3][1]++;
	    }
	for(int i=0;i<4;i++)
	    {
		
			System.out.println(s[i][0]+" "+s[i][1]);
		    
	    }
    }
}