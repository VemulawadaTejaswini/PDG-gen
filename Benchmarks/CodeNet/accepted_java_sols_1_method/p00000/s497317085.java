class Main{
	public static void main(String[]s){
		for(int i=8;++i<90;)
		//System.out.printf("%d,%d,%d\n",i,i/9,i%9);
		System.out.printf(i/9+"x%d=%d\n",i%9+1,i/9*(i%9+1));
	}
}