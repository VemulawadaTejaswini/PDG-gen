import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		String a = sc.next();
		String b = sc.next();
		int c = 1;
		if(a.length()+1 !=b.length()) c=0;
		for(int i =0; i<a.length();i++) {
			if(!(a.charAt(i)==b.charAt(i))) c =0;
		}
		if(c==1)System.out.println("Yes");
		else System.out.println("No");
	}
}
