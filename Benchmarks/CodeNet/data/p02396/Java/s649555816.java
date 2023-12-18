import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	int j=1;
	while(true)
	    {
	int i;	
		Scanner scan=new Scanner(System.in);
		i=scan.nextInt();
		if(i==0)break;
		System.out.println("Case "+j+": "+i);
		j++;
	    }
    }
}