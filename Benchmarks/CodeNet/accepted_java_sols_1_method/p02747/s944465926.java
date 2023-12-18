import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length()%2 == 1){
			System.out.println("No");
			return;
		}
		String remain = s;
		while(remain.length()>1){
			String tmp = remain.substring(0,2);
			if(!tmp.equals("hi")){
				System.out.println("No");
				return;
			}else{
				remain = remain.substring(2);
			}
		}
		System.out.println("Yes");
	}
}