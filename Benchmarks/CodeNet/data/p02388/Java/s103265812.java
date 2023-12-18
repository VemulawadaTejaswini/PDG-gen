class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String s;
		s = buf.readLine();
		int i = Integer.parseInt(s);
		i = i*i*i;
		System.out.println(i);
	}
}