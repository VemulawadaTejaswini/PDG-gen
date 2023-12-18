import java.util.Scanner;
public class Main{
	static public void main(String[] args){
		m1();
	}
	static public void m1(){
		Scanner scanner = new Scanner(System.in);

		String s = scanner.next();
	  	String result;
		if(s.endsWith("s")){
			result = s + "es";
		}else{
			result = s + "s";
		}
		System.out.println(result);

	}
	static public void m2(){
	}
}
