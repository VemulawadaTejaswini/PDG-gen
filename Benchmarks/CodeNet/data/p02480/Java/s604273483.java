class Main
{
	public static void main(String[] args)
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int x = Integer.parseInt(line);
		x = x*x*x;
		System.out.println(x);
	}
}