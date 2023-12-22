import java.util.*;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong()-1;
		ArrayList<Character> list=new ArrayList<>();
		while(n>=0){
			list.add((char)('a'+n%26));
			n/=26;
			n--;
		}
		for(int i=list.size()-1; i>=0; i--){
			System.out.print(list.get(i));
		}
	}
}
