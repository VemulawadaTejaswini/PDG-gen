class Main
{
	
	public static void main(String[] agrs)throws IOException
	{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
	String str1=br.readLine();
	int a=Integer.parseInt(str);
	int a1=Integer.parseInt(str1);
	
	System.out.println(a*a1+" "+(a*2+a1*2));
	}
	}