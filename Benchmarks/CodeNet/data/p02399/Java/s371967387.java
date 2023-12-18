	public static void main(String[] args) throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String [] digit=reader.readLine().split(" ");
		int a=Integer.parseInt(digit[0]);
		int b=Integer.parseInt(digit[1]);
		int d=a/b;
		int r=a%b;
		double f=a/b;
		sb.append(d+" "+r+" "+String.format("%.5f", (double)a/(double)b));
		System.out.println(sb);
	}
	