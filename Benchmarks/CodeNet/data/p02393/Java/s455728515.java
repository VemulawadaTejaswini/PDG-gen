import java.util.Scanner;
class exe5
{
    public static void main(String args[])
    {
	int small,middle,big,x;
	Scanner scan=new Scanner(System.in);
	small=scan.nextInt();
	middle=scan.nextInt();
	big=scan.nextInt();
	if(small>middle)
	    {
		x=middle;
		middle=small;
		small=x;
	    }
	if(small>big)
	    {
		x=big;
		big=small;
		small=x;
	    }
	if(middle>big)
	    {
		x=big;
		big=middle;
		middle=x;
	    }
	System.out.println(small+" "+middle+" "+big);
    }
}