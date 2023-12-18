public class Main{
	static public void main(String[] args){
		m1();
	}
	static public void m1(){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		//int n = scan.nextInt();
		String s = scan.next();
	  	//int result;
	  	String result;
		if(s.endsWith("s")){
			result = result + "es";
		}else{
			result = result + "s";
		}
		System.out.println(result);

	}
	static public void m2(){
	  	int n = scan.nextInt();
	}
}
