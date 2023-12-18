import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
	
		int a= reader.nextInt();
		int b= reader.nextInt();
		int c= reader.nextInt();
		Set<Integer>s=new HashSet<Integer>();
		s.add(a);
		s.add(b);
		s.add(c);
		System.out.print(s.size());
	}
	
	

}
