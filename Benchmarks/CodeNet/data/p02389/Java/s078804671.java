class Main
{
	static int menseki(int a,int b)
	{
		int sum1;
		sum1=a*b;
		return sum1;
	}
		static int mawari(int a,int b)
	{
		int sum1;
		sum1=(a*2)+(b*2);
		return sum1;
	}

	public static void main(String[] atgs)
	{
		int a=3;
		int b=5;
		int menseki;
		int mawari;
		System.out.print(menseki(a,b)+" "+mawari(a,b));
	}
}