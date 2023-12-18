public class Main {
	public static void main(String[] args)
	{
		int a;
		int i=0;
		while(true)
		{
			a= Integer.parseInt(args[i]);
			if(a==0)
				break;
			System.out.println("case "+(i+1)+": "+a);
			i++;
		}
	}

}