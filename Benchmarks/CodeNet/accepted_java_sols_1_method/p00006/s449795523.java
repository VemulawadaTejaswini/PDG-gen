import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String line = in.next();
		char ch[] = line.toCharArray();
		for(int i=line.length(); i>0; i--){
			System.out.print(ch[i-1]);
		}
		System.out.println();
	}
}