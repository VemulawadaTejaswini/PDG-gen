class main{
	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		x=x+y;
		String num = Integer.toString(x);
		System.out.println(num.length());
	}
}