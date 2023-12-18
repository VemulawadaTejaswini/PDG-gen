
import java.util.HashMap;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("A",0);
		m.put("B",0);
		m.put("AB",0);
		m.put("O",0);
		while(sc.hasNext()){
			String s[] = sc.nextLine().split(",");
			m.put(s[0],m.get(s[0])+1);
		}
		System.out.println(m.get("A"));
		System.out.println(m.get("B"));
		System.out.println(m.get("AB"));
		System.out.println(m.get("O"));
		
	}

}