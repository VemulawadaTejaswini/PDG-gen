import java.util.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int max = 0;
		int counter = 0;
		
		for(int i = 0; i < s.length(); ++i) {
		    if(s.charAt(i) == 'A' || s.charAt(i) == 'C' || s.charAt(i) == 'G' || s.charAt(i) == 'T'){
		        ++counter;
		        if(max < counter) max = counter;
		        else continue;
		    }
		    else counter = 0;
		}
		
		System.out.println(max);
	}
}