import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String mozi = sc.next();
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < mozi.length(); i++){
			ret.append("x");
		}
		System.out.println(ret.toString());
	}
}	