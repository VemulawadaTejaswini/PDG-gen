
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] c = new String[]{"w", "", "k", "s", "t", "n", "h", "m", "y", "r"};
		String s = sc.next();
		for(int i=0;i<s.length()/2;i++){
			char ss = s.charAt(i*2+1);
			
			if(s.charAt(i*2) != '0' || ss != 'U'){
				System.out.print(c[s.charAt(i*2)-'0']);
				if(ss == 'T')
					System.out.print("a");
				else if(ss == 'L')
					System.out.print("i");
				else if(ss == 'U')
					System.out.print("u");
				else if(ss == 'R')
					System.out.print("e");
				else if(ss == 'D')
					System.out.print("o");
			}else{
				System.out.print("nn");
			}
		}
		System.out.println();
	}
}