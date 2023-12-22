import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(a);
		list.add(b);
		list.add(c);
		
		System.out.println(list.get(2)+" "+list.get(0)+" "+list.get(1));
		
	}
}
