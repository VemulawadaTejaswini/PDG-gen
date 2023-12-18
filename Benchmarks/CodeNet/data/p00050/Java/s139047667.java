import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = sc.nextLine();
			s = s.replace("apple", "johnnyhibiki");
			s = s.replace("peach", "apple");
			s = s.replace("johnnyhibiki", "peach");
			System.out.println(s);
		}
	}
}