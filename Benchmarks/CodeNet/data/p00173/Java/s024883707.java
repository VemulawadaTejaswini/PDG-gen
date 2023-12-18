import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<9;i++)
	    {
		String name=scan.next();
		int mor,aft;
		mor=scan.nextInt();
		aft=scan.nextInt();
		System.out.println(name+" "+(mor+aft)+" "+(200*mor+300*aft));
	    }
    }
}