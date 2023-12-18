public class Main {
	public static void main(String[] args)
	{
		int[] a=new int[100];
		int i=0;
		do
		{
			a[i]= Integer.parseInt(args[i]);
			System.out.println("case "+(i+1)+": "+a[i]);
			i++;
		}while(a[i-1]!=0);
	}

}