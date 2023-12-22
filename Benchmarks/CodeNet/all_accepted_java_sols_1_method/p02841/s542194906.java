import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int m_1= sc.nextInt();
		int d_1= sc.nextInt();
		int m_2= sc.nextInt();
		int d_2= sc.nextInt();
		if(m_1!=m_2)
			System.out.println("1");
		else
			System.out.println("0");
	}
}