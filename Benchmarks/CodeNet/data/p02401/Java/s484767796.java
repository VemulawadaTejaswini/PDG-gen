import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] st = s.split(" ");
		while (true){
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
			}else{
				break;
			}
		}
	}
}