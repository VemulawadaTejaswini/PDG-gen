public class Main{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int x = Integer.parseInt(s);

		System.out.println(x*x*x);
	}

}