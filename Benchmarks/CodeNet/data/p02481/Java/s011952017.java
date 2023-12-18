public class Main {
	public static void main(String[] args) throws IOException {
		int a,b;

		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String s = buf.readLine();
		String[] str=s.split(" ");
		a = Integer.parseInt(str[0]);
		b = Integer.parseInt(str[1]);
		
		System.out.println(a*b +" "+2*(a+b));
			
	}

}