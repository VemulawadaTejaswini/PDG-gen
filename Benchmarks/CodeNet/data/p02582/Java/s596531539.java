import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		if(s == "SSS") {
			System.out.println(0);
		}else if(s == "SRS" || s == "RSR") {
			System.out.println(1);
		}else if(s == "RRR") {
			System.out.println(3);
		}else {
			System.out.println(2);
		}
				
		
	}
}