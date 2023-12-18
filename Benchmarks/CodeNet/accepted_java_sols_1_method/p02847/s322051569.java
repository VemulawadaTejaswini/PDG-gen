import java.util.Scanner;
 

public class Main {
	
	private static final String[] WEEKS = {"SUN","MON","TUE","WED","THU","FRI","SAT" };
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        int i = 0;
        for (; i < WEEKS.length; i++) {
        	if (line.equals(WEEKS[i])) break;
        }
        
        System.out.println(WEEKS.length - i);
        sc.close();
	}
	
}
