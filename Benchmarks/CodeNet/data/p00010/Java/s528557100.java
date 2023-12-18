public class Main {
	public static void main(String[] args){
		double a = 903.2349553490;
		double b = 2389457.23490350;
		double c;
		
		for(int k=0;k<Integer.MAX_VALUE;k++){
			for(int i=0;i<Integer.MAX_VALUE;i++){
				c = b*a*k*i;
System.out.println(c);
			}
		}
		
		
	}

}