public class ku {

	/**
	 * @param args
	 */
	public static void main(String[] args)
			throws java.io.IOException{
		int n=System.in.read();
		System.out.print(fact(n));
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	public static int fact(int n){
		if(n==0) return 1;
		return n*fact(n-1);
		
	}

}