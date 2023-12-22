import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = String.valueOf(sc.nextInt());
		String rn="";
		for(int i = 0;i < 3;i++) {
			if(n.charAt(i) == '1') rn += "9";
			else rn += "1";
		}
		System.out.println(Integer.valueOf(rn));
	}
}