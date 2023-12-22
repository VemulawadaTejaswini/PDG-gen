import java.util.HashSet;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		HashSet<String> at = new HashSet<>();
		at.add("A");
		at.add("C");
		at.add("G");
		at.add("T");

		int i,j,temp;
		int len = s.length();
		int max = Integer.MIN_VALUE;

		for(i = 0; i < len; i++) {
			temp = 0;
			for(j = i; j < len; j++) {
				if(!at.contains(s.substring(j, j + 1))) {
					break;
				}
				temp++;
			}
			max = Math.max(max, temp);
		}
		System.out.println(max);
	}
}
