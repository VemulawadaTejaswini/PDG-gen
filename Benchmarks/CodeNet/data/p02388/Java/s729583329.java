class Xcubic{
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		
		if(1 <= x <= 100){
			int ans = x * x * x;
			System.out.println(ans);
		}
	}
}