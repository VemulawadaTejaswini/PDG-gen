import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		String n = sc.next();
		if(n.equals("SUN"))
			System.out.println(7);
		else if(n.equals("MON"))
			System.out.println(6);
		else if(n.equals("TUE"))
			System.out.println(5);
		else if(n.equals("WED"))
			System.out.println(4);
		else if(n.equals("THU"))
			System.out.println(3);
		else if(n.equals("FRI"))
			System.out.println(2);
		else if(n.equals("SAT"))
			System.out.println(1);
	}
}