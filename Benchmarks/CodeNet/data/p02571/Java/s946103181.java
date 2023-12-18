import java.util.*;

 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int count = 0;

		if(s.contains(t)){
			System.out.println(count);
		}else{
		for(int i = 1; i <= t.length(); i ++){
			if(s.contains(t.substring(0, t.length() - i))){
				count = i;
				break;
			}
		if(s.contains(t.substring(t.length() - 1 - i, t.length() - 1))){
			count = t.length() - i;
			break;
		}
		}
		System.out.println(count);
	}
	}
}