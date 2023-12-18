import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String line;
	static int res;
	public static void main(String[] args) {
		while(read()){
			slove();
		}
		System.out.println(res);
	}
	static boolean read(){
		if(!sc.hasNext())
			return false;
		line = sc.next();
		return true;
	}
	static void slove(){
		if(line.equals(new StringBuffer(line).reverse().toString())){
			res++;
		}
	}
}