import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String[] strs = str.split("");
		boolean flag = true;

		if(!strs[2].equals(strs[3])) flag = false;
		if(!strs[4].equals(strs[5])) flag = false;

		if (flag) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}