class Main
{
	public static void main (String[] args)
	{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String s;
		s = buf.readLine();
		int i = Integer.parseInt(s);
		i = i^3;
		System.out.println(i);
	}
}