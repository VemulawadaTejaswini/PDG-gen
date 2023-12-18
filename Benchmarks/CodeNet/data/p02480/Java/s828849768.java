public class Main
{

	public static void main(String arg[])
	{
		int i= 0;
		if(arg[0] != null)
			i = Integer.parseInt(arg[0]);
		System.out.println(i * i * i);
	}
}