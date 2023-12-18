class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int a,b;
		try{
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			System.out.println(a*b+ (2*a+2*b));
		}catch (IOException e){
			System.exit(0);
		}
	}
}