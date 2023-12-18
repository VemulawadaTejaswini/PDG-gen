import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true){
			String s = sc.nextLine();
			String[] st = s.split(" ");
			int x = Integer.parseInt(st[0]);
			s = st[1];
			int y = Integer.parseInt(st[2]);
			if(s.equals("+")){
				System.out.println(x+y);
			}else if(s.equals("-")){
				System.out.println(x-y);
			}else if(s.equals("*")){
				System.out.println(x*y);
			}else if(s.equals("/")){
				System.out.println(x/y);
			}else if(s.equals("?")){
				break;
			}
		}
	}
}