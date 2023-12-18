class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		output();
	}
 
	private static void output ()
	{
		for (int i = 1; i <= 9; i++){
			for (int j = 1; j <= 9; j++){
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
	}
}