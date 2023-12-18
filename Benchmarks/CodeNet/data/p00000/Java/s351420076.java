class Main{
    public static void main(String[] a){
		int[] num1 = {1,2,3,4,5,6,7,8,9};
		int[] num2 = {1,2,3,4,5,6,7,8,9};
		
		for(int a: num1){
			for(int b: num2){
				System.out.println(a+"x"+b+"="+kuku(a,b));
			}
    }
}
	public static int kuku(int a,int b){
		return a*b;
	}
}