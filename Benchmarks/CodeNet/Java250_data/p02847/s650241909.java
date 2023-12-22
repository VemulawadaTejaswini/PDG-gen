import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String week[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		for(int i=0;i<7;i++) {
			if(str.equals(week[i])) {
				System.out.println(7-i);
			}
		}
	}	
}